
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OOP-SEVILLA
 */
public class TempSetter {

    private String Mode;
    private String Fan;
    private String TempType;
    private double DesiredTemperature;
    private double TemperatureInside;
    private double TemperatureOutside;

    public TempSetter() {
        Mode = "off";
        Fan = "auto";
        TempType = "C";
        DesiredTemperature = 26;
        TemperatureInside = 26;
        TemperatureOutside = 28;
    }

    public String getMode() {
        return Mode;
    }

    public String getFan() {
        return Fan;
    }

    public String getTempType() {
        return TempType;
    }

    public double getDesiredTemperature() {
        return DesiredTemperature;
    }

    public double getTemperatureOutside() {
        return TemperatureOutside;
    }

    public double getTemperatureInside() {
        return TemperatureInside;
    }

    public void setDesiredTemperature(double setDesiredTemperature) {
        DesiredTemperature = setDesiredTemperature;
    }

    public void setTemperatureOutside(double setTemperatureOutside) {
        TemperatureOutside = setTemperatureOutside;
    }

    public void setTemperatureInside(double setTemperatureInside) {
        TemperatureInside = setTemperatureInside;
    }

    public void setMode(String setMode) {
        Mode = setMode;
    }

    public void setFan(String setFan) {
        Fan = setFan;
    }

    public void setTempType(String setTempType) {
        TempType = setTempType;
    }

    public void increaseDesiredTemperature() {

        DesiredTemperature++;
    }

    public void decreaseDesiredTemperature() {

        DesiredTemperature--;
    }

    public void increaseTemperatureInside() {
        if (TempType == "C") {
            TemperatureInside = (TemperatureInside * 9 / 5) + 32;
            TemperatureInside++;
            TemperatureInside = (TemperatureInside - 32) * 5 / 9;
        } else if (TempType == "F") {
            TemperatureInside++;
        }

    }

    public void decreaseTemperatureInside() {
        if (TempType == "C") {
            TemperatureInside = (TemperatureInside * 9 / 5) + 32;
            TemperatureInside--;
            TemperatureInside = (TemperatureInside - 32) * 5 / 9;
        } else if (TempType == "F") {
            TemperatureInside--;
        }
    }

    public void setTemperatureInsideValue() {
        TemperatureInside = DesiredTemperature;
    }

}
