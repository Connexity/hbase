/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.hbase.avro.generated;

@SuppressWarnings("all")
public class ADelete extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"ADelete\",\"namespace\":\"org.apache.hadoop.hbase.avro.generated\",\"fields\":[{\"name\":\"row\",\"type\":\"bytes\"},{\"name\":\"columns\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AColumn\",\"fields\":[{\"name\":\"family\",\"type\":\"bytes\"},{\"name\":\"qualifier\",\"type\":[\"bytes\",\"null\"]}]}},\"null\"]}]}");
  public java.nio.ByteBuffer row;
  public java.util.List<org.apache.hadoop.hbase.avro.generated.AColumn> columns;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return row;
    case 1: return columns;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: row = (java.nio.ByteBuffer)value$; break;
    case 1: columns = (java.util.List<org.apache.hadoop.hbase.avro.generated.AColumn>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
