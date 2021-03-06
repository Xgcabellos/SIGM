/**
 * HitosExpediente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package ieci.tecdoc.sgm.ct.ws.client;

public class HitosExpediente  extends ieci.tecdoc.sgm.ct.ws.client.RetornoServicio  implements java.io.Serializable {
    private ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] expedientes;

    private ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] hitosExpedientes;

    public HitosExpediente() {
    }

    public HitosExpediente(
           java.lang.String errorCode,
           java.lang.String returnCode,
           ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] expedientes,
           ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] hitosExpedientes) {
        super(
            errorCode,
            returnCode);
        this.expedientes = expedientes;
        this.hitosExpedientes = hitosExpedientes;
    }


    /**
     * Gets the expedientes value for this HitosExpediente.
     * 
     * @return expedientes
     */
    public ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] getExpedientes() {
        return expedientes;
    }


    /**
     * Sets the expedientes value for this HitosExpediente.
     * 
     * @param expedientes
     */
    public void setExpedientes(ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] expedientes) {
        this.expedientes = expedientes;
    }


    /**
     * Gets the hitosExpedientes value for this HitosExpediente.
     * 
     * @return hitosExpedientes
     */
    public ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] getHitosExpedientes() {
        return hitosExpedientes;
    }


    /**
     * Sets the hitosExpedientes value for this HitosExpediente.
     * 
     * @param hitosExpedientes
     */
    public void setHitosExpedientes(ieci.tecdoc.sgm.ct.ws.client.HitoExpediente[] hitosExpedientes) {
        this.hitosExpedientes = hitosExpedientes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HitosExpediente)) return false;
        HitosExpediente other = (HitosExpediente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expedientes==null && other.getExpedientes()==null) || 
             (this.expedientes!=null &&
              java.util.Arrays.equals(this.expedientes, other.getExpedientes()))) &&
            ((this.hitosExpedientes==null && other.getHitosExpedientes()==null) || 
             (this.hitosExpedientes!=null &&
              java.util.Arrays.equals(this.hitosExpedientes, other.getHitosExpedientes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExpedientes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpedientes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpedientes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHitosExpedientes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHitosExpedientes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHitosExpedientes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HitosExpediente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "HitosExpediente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expedientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "expedientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "HitoExpediente"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitosExpedientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "hitosExpedientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "HitoExpediente"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
