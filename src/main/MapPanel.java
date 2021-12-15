package main;

import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class MapPanel extends JPanel {
    public static JXMapKit map; //L'objet "carte"
    public GeoPosition Nantes_Focus; //Le point central de la carte au chargement
    public LinkedHashSet<DefaultWaypoint> waypoints = new LinkedHashSet<>(); //Un hashset contenant tous les waypoints affichés

    MouseListener addMarqueur = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {
            /** création d'un marqueur en cliquant  */
            JXMapViewer me_src = (JXMapViewer) me.getSource();

            DefaultWaypoint nouveau = new DefaultWaypoint();
            nouveau.setPosition(new GeoPosition(me_src.convertPointToGeoPosition(me.getPoint()).getLatitude(),
                    me_src.convertPointToGeoPosition(me.getPoint()).getLongitude()));

            waypoints.add(nouveau);
//            WaypointPainter<DefaultWaypoint> painter = new WaypointPainter<>();
//            painter.setWaypoints(waypoints);
//            map.getMainMap().setOverlayPainter(painter);
            setMap(waypoints);


            System.out.println(" mouse  x coordinates =" + me_src.getMousePosition().getX() + "/ mouse y coordinates =" + me_src.getMousePosition().getY());
            System.out.println("CONVERTING MOUSE COORDINATES TO geoposition ones =====> latitude :"
                    + me_src.convertPointToGeoPosition(me.getPoint()).getLatitude() + "  longitude :"
                    + me_src.convertPointToGeoPosition(me.getPoint()).getLongitude());
        }

        public void mousePressed(MouseEvent e) {} public void mouseReleased(MouseEvent e) {} public void mouseEntered(MouseEvent e) {} public void mouseExited(MouseEvent e) {}
    };

    public MapPanel() {

        this.setLayout(new BorderLayout());

        this.map = new JXMapKit();
        this.Nantes_Focus = new GeoPosition(47.237607605371686, -1.5542161281083542);

        /** Creer une TileFactoryInfo pour importer OpenStreetMap La Tile factory genere grosso modo topus les points de la carte */
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        map.setTileFactory(tileFactory);

        /** AFFICHARGE MARQUEUR */
//        ArrayList<GeoPosition> track = new ArrayList<>();
//        for(DefaultWaypoint waypoint : waypoints) {
//            track.add(waypoint.getPosition());
//        }
//        RoutePainter routePainter = new RoutePainter(track);
//
//        WaypointPainter<DefaultWaypoint> painter = new WaypointPainter<>();
//        painter.setWaypoints(waypoints);
//        map.getMainMap().setOverlayPainter(painter);
        setMap(waypoints);

        /** Interactions  avec le bouton de la souris*/
//        MouseInputListener mia = new PanMouseInputListener(map);
//        map.addMouseListener(mia);
//        map.addMouseMotionListener(mia);
//        map.addMouseListener(new CenterMapListener(map));
//        map.addMouseWheelListener(new ZoomMouseWheelListenerCursor(map));
//        map.addKeyListener(new PanKeyListener(map));

        /** Affichage de la carte */
        map.setAddressLocation(Nantes_Focus);
        map.setZoom(4);
        map.getMainMap().addMouseListener(addMarqueur);
        this.add(map);
    }

    private void setMap(LinkedHashSet<DefaultWaypoint> waypoints) {
        ArrayList<GeoPosition> track = new ArrayList<>();
        for(DefaultWaypoint waypoint : waypoints) {
            track.add(waypoint.getPosition());
        }
        RoutePainter routePainter = new RoutePainter(track);
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<Waypoint>();
        waypointPainter.setWaypoints(waypoints);
        List<Painter<JXMapViewer>> painters = new ArrayList<Painter<JXMapViewer>>();
        painters.add(routePainter);
        painters.add(waypointPainter);

        CompoundPainter<JXMapViewer> painter = new CompoundPainter<JXMapViewer>(painters);
        map.getMainMap().setOverlayPainter(painter);
    }

//     METHODE MAIN DESTINEE U N I Q U E M E N T AU DEBUG
    public static void main(String[] args) {
        JFrame test = new JFrame("test");
        test.add(new MapPanel(), BorderLayout.CENTER);
//        test.add(new JButton())
        test.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        test.setPreferredSize(new Dimension(600, 400));

        test.pack();
        test.setVisible(true);
    }

}