/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author kolendus
 */
public class Test {
    /*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bortol
 */
/*
public class Controller {
    
    private Model model = new Model();
    private Scanner scan = new Scanner();
    private Transformator tran = new Transformator();
    
    public void loadFile(JFileChooser ch) throws JDOMParseException{
        ch.showOpenDialog(null);
        String path=ch.getSelectedFile().getAbsolutePath();
        model.setPath(path);
        scan.setPath(model.getPath());
        model.setArray(scan.scanFile());

    }
    
    public void setTimeStep(JTextField tx) throws NumberFormatException{
            Double t = Double.parseDouble(tx.getText());
            if(t < 1)
                throw new NumberFormatException();
            model.setTimeStep(t);
    }
    
    public void setSimLength(JTextField tx) throws NumberFormatException{
        Double t = Double.parseDouble(tx.getText());
            if(t < 1 || t<model.getTimeStep())
                throw new NumberFormatException();
        model.setSimLength(t);
    }
    
    public void setCollisionMode(JComboBox cb) {
        String condition = (String) cb.getSelectedItem();
        if(condition.equals("On")) {
            model.setCollisionMode(true);
        }
        else model.setCollisionMode(false);
    }
    
    public void setGravConst(JTextField tx) throws NumberFormatException {
        Double t = Double.parseDouble(tx.getText());
            if(t == 0)
                throw new NumberFormatException();
        model.setGravConst(t);
    }
    
    public JPanel makeAnimation() throws IOException{
        return new Animation(1118,792,"part.png",model.getArray(),(int) (model.getSimLength()/model.getTimeStep()));
    }
    
    public JPanel makeAnimation(int n) throws IOException{
        return new Animation(1118,792,"part.png",model.getArray(),n);
    }
    
    public void getInfo() {
    }
    
    public void startEngine() {
        Engine en = new Engine(model.getTimeStep(),model.getSimLength(), model.getGravConst(), model.getCollisionMode());

        en.calculateCoordinates(model.getArray());
        en.calculateTotalEnergy(en.getEkin(), en.getEpot());
        
        model.setEkin(en.getEkin());
        model.setEpot(en.getEpot());
        model.setEtot(en.getEm());
        
        model.setEkinLimit(en.getEkinLimit());
        model.setEpotLimit(en.getEpotLimit());
        model.setEtotalLimit(en.getEmLimit());
        
        tran.calibrate(model.getArray());
    }
    
    public ArrayList<Body> getArray() {
        return model.getArray();
    }
    
    public Chart makeEkin() {
        return new Chart(model.getEkin(),"Kinetic Energy", (int) ((int) model.getSimLength()/model.getTimeStep()));
    }
    
    public Chart makeEpot() {
        return new Chart(model.getEpot(),"Potential Energy", (int) ((int) model.getSimLength()/model.getTimeStep()));
    }
    public Chart makeEtotal() {

        return new Chart(model.getEtot(),"Total Energy", (int) ((int) model.getSimLength()/model.getTimeStep()));
    }
    
}
*/
}
