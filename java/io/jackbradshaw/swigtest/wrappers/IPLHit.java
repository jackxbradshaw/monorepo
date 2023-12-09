/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class IPLHit {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IPLHit(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IPLHit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(IPLHit obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libphononJNI.delete_IPLHit(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDistance(float value) {
    libphononJNI.IPLHit_distance_set(swigCPtr, this, value);
  }

  public float getDistance() {
    return libphononJNI.IPLHit_distance_get(swigCPtr, this);
  }

  public void setTriangleIndex(int value) {
    libphononJNI.IPLHit_triangleIndex_set(swigCPtr, this, value);
  }

  public int getTriangleIndex() {
    return libphononJNI.IPLHit_triangleIndex_get(swigCPtr, this);
  }

  public void setObjectIndex(int value) {
    libphononJNI.IPLHit_objectIndex_set(swigCPtr, this, value);
  }

  public int getObjectIndex() {
    return libphononJNI.IPLHit_objectIndex_get(swigCPtr, this);
  }

  public void setMaterialIndex(int value) {
    libphononJNI.IPLHit_materialIndex_set(swigCPtr, this, value);
  }

  public int getMaterialIndex() {
    return libphononJNI.IPLHit_materialIndex_get(swigCPtr, this);
  }

  public void setNormal(IPLVector3 value) {
    libphononJNI.IPLHit_normal_set(swigCPtr, this, IPLVector3.getCPtr(value), value);
  }

  public IPLVector3 getNormal() {
    long cPtr = libphononJNI.IPLHit_normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IPLVector3(cPtr, false);
  }

  public void setMaterial(IPLMaterial value) {
    libphononJNI.IPLHit_material_set(swigCPtr, this, IPLMaterial.getCPtr(value), value);
  }

  public IPLMaterial getMaterial() {
    long cPtr = libphononJNI.IPLHit_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IPLMaterial(cPtr, false);
  }

  public IPLHit() {
    this(libphononJNI.new_IPLHit(), true);
  }

}
