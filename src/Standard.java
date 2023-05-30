public class Standard {


    ax^2+bx+char

    private String equation;
    public Standard(String equation){
        this.equation = equation;
    }
    public double getX(){
        int location = equation.indexOf("^");
        String x = "";
        String newStr = equation.substring(location);
        if(newStr.contains("+")){
            x = newStr.substring(newStr.indexOf("+"), newStr.indexOf("x")+1);
            return Double.parseDouble(x)
        }


    }
}
