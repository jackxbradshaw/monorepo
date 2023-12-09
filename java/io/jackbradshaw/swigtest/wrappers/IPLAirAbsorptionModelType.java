/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class IPLAirAbsorptionModelType {
  public final static IPLAirAbsorptionModelType IPL_AIRABSORPTIONTYPE_DEFAULT = new IPLAirAbsorptionModelType("IPL_AIRABSORPTIONTYPE_DEFAULT");
  public final static IPLAirAbsorptionModelType IPL_AIRABSORPTIONTYPE_EXPONENTIAL = new IPLAirAbsorptionModelType("IPL_AIRABSORPTIONTYPE_EXPONENTIAL");
  public final static IPLAirAbsorptionModelType IPL_AIRABSORPTIONTYPE_CALLBACK = new IPLAirAbsorptionModelType("IPL_AIRABSORPTIONTYPE_CALLBACK");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static IPLAirAbsorptionModelType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + IPLAirAbsorptionModelType.class + " with value " + swigValue);
  }

  private IPLAirAbsorptionModelType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private IPLAirAbsorptionModelType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private IPLAirAbsorptionModelType(String swigName, IPLAirAbsorptionModelType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static IPLAirAbsorptionModelType[] swigValues = { IPL_AIRABSORPTIONTYPE_DEFAULT, IPL_AIRABSORPTIONTYPE_EXPONENTIAL, IPL_AIRABSORPTIONTYPE_CALLBACK };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

