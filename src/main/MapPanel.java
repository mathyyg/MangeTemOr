package main;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import org.jxmapviewer.viewer.*;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.util.HashSet;

public class MapPanel extends JPanel {
    public static JXMapViewer map; //L'objet "carte"
    public GeoPosition Nantes_Focus; //Le point central de la carte au chargement
    public HashSet<DefaultWaypoint> waypoints; //Un hashset contenant tous les waypoints affichés

    public MapPanel() {

        this.setLayout(new BorderLayout());

        this.map = new JXMapViewer();
        this.Nantes_Focus = new GeoPosition(47.237607605371686, -1.5542161281083542);

        /** Creer une TileFactoryInfo pour importer OpenStreetMap La Tile factory genere grosso modo topus les points de la carte */
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        map.setTileFactory(tileFactory);

        /** AFFICHARGE MARQUEUR */
        WaypointPainter<DefaultWaypoint> painter = new WaypointPainter<>();
        map.setOverlayPainter(painter);

        /** Interactions  avec le bouton de la souris*/
        MouseInputListener mia = new PanMouseInputListener(map);
        map.addMouseListener(mia);
        map.addMouseMotionListener(mia);
        map.addMouseListener(new CenterMapListener(map));
        map.addMouseWheelListener(new ZoomMouseWheelListenerCursor(map));
        map.addKeyListener(new PanKeyListener(map));

        /** Affichage de la carte */
        map.setAddressLocation(Nantes_Focus);
        map.setZoom(4);
        this.add(map);
    }

//     METHODE MAIN DESTINEE U N I Q U E M E N T AU DEBUG
    public static void main(String[] args) {
        JFrame test = new JFrame("test");
        test.add(new MapPanel());
        test.add(new JButton())
        test.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        test.setPreferredSize(new Dimension(600, 400));

        test.pack();
        test.setVisible(true);
    }

}