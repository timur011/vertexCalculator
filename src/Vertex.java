public class Vertex {
    private String formula;

    public Vertex(String formula){
        this.formula = formula;
    }

    public double getX(){
        String temp = formula.substring(0, formula.indexOf("^"));
        int firstLoc = 0;
        if(temp.contains("+")){
            firstLoc = temp.indexOf("+");
        }
        else if(!temp.contains("+")){
            firstLoc = temp.indexOf("-");
        }
        return Double.parseDouble(temp.substring((firstLoc + 1), temp.indexOf(")")));

    }

    public double getY(){
        String temp2 = formula.substring()
    }




}
