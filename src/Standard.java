public class Standard {




    private String equation;
    public Standard(String equation){
        this.equation = equation;
    }
    public double getX(){
        double a;
        if(equation.substring(0, 1).equals("x")){
            a = 1;
        }else {
            a = Double.parseDouble(equation.substring(0, equation.indexOf("x")));
        }
        int location = equation.indexOf("^");
        int finalLoc = equation.lastIndexOf("x");
        String x = "";
        String newStr = equation.substring(location, finalLoc);
        if(newStr.contains("+")){
            x = newStr.substring(newStr.indexOf("+"));
            return (-1*Double.parseDouble(x)) / (2*a);
        }
        else if(newStr.contains("-")){
            x = newStr.substring(newStr.indexOf("-"));
            return (-1*Double.parseDouble(x)) / (2*a);
        }
        return 0;

    }
    public double getY(){
        double firstPart, secondPart, thirdPart;
        double a;
        if(equation.substring(0, 1).equals("x")){
            a = 1;
        }else {
            a = Double.parseDouble(equation.substring(0, equation.indexOf("x")));
        }
        secondPart = 0;
        double xCoor = getX();
        firstPart = a * (xCoor * xCoor);
        double bValue;
        String b = equation.substring(equation.indexOf("^"), equation.lastIndexOf("x"));
        if(b.contains("+")){
            bValue = Double.parseDouble(b.substring(b.indexOf("+") + 1));
            secondPart = bValue * xCoor;
        }
        else if(b.contains("-")){
            bValue = Double.parseDouble(b.substring(b.indexOf("-") + 1));
            secondPart = bValue * xCoor;
            secondPart *= -1;
        }


        thirdPart = Double.parseDouble(equation.substring(equation.lastIndexOf("x") + 2));
        if(equation.substring(equation.lastIndexOf("x")).contains("-")){
            thirdPart *= -1;
        }

        return firstPart + secondPart + thirdPart;

    }
    public void say(){
        System.out.println("The coordinates of the vertex are (" + getX() + ", " + getY() + ")");
    }


    public double returnY(double x){
        double firstPart, secondPart, thirdPart;
        double a;
        if(equation.substring(0, 1).equals("x")){
            a = 1;
        }else {
            a = Double.parseDouble(equation.substring(0, equation.indexOf("x")));
        }
        secondPart = 0;
        double xCoor = x;
        firstPart = a * (xCoor * xCoor);
        double bValue;
        String b = equation.substring(equation.indexOf("^"), equation.lastIndexOf("x"));
        if(b.contains("+")){
            bValue = Double.parseDouble(b.substring(b.indexOf("+") + 1));
            secondPart = bValue * xCoor;
        }
        else if(b.contains("-")){
            bValue = Double.parseDouble(b.substring(b.indexOf("-") + 1));
            secondPart = bValue * xCoor;
            secondPart *= -1;
        }


        thirdPart = Double.parseDouble(equation.substring(equation.lastIndexOf("x") + 2));
        if(equation.substring(equation.lastIndexOf("x")).contains("-")){
            thirdPart *= -1;
        }

        return firstPart + secondPart + thirdPart;


    }


}
