/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class IPLBakedDataType {
  public final static IPLBakedDataType IPL_BAKEDDATATYPE_REFLECTIONS = new IPLBakedDataType("IPL_BAKEDDATATYPE_REFLECTIONS");
  public final static IPLBakedDataType IPL_BAKEDDATATYPE_PATHING = new IPLBakedDataType("IPL_BAKEDDATATYPE_PATHING");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static IPLBakedDataType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + IPLBakedDataType.class + " with value " + swigValue);
  }

  private IPLBakedDataType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private IPLBakedDataType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private IPLBakedDataType(String swigName, IPLBakedDataType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static IPLBakedDataType[] swigValues = { IPL_BAKEDDATATYPE_REFLECTIONS, IPL_BAKEDDATATYPE_PATHING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

