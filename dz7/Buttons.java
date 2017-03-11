import javax.swing.*;
class Buttons extends JFrame  {
    ImageIcon tick = new ImageIcon("tick.png");
    ImageIcon cross = new ImageIcon("cross.png" );
    JButton btn = new JButton("Push me") ;
    JButton tickBtn = new JButton(tick) ;
    JButton crossBtn = new JButton("STOP", cross) ;
    
    public Buttons() {
        super("Swing window");
        JPanel pnl = new JPanel();
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        pnl.add(btn) ;
        pnl.add(tickBtn) ;
        pnl.add(crossBtn) ;
        setVisible(true);
    }    
}