/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class DomainNotLoadedException extends Exception implements TBase<DomainNotLoadedException, DomainNotLoadedException._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("DomainNotLoadedException");

  private static final TField DOMAIN_FIELD_DESC = new TField("domain", TType.STRING, (short)1);

  private String domain;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    DOMAIN((short)1, "domain");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DOMAIN
          return DOMAIN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOMAIN, new FieldMetaData("domain", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(DomainNotLoadedException.class, metaDataMap);
  }

  public DomainNotLoadedException() {
  }

  public DomainNotLoadedException(
    String domain)
  {
    this();
    this.domain = domain;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainNotLoadedException(DomainNotLoadedException other) {
    if (other.is_set_domain()) {
      this.domain = other.domain;
    }
  }

  public DomainNotLoadedException deepCopy() {
    return new DomainNotLoadedException(this);
  }

  @Deprecated
  public DomainNotLoadedException clone() {
    return new DomainNotLoadedException(this);
  }

  public String get_domain() {
    return this.domain;
  }

  public void set_domain(String domain) {
    this.domain = domain;
  }

  public void unset_domain() {
    this.domain = null;
  }

  /** Returns true if field domain is set (has been asigned a value) and false otherwise */
  public boolean is_set_domain() {
    return this.domain != null;
  }

  public void set_domain_isSet(boolean value) {
    if (!value) {
      this.domain = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOMAIN:
      if (value == null) {
        unset_domain();
      } else {
        set_domain((String)value);
      }
      break;

    }
  }

  public void setFieldValue(int fieldID, Object value) {
    setFieldValue(_Fields.findByThriftIdOrThrow(fieldID), value);
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOMAIN:
      return get_domain();

    }
    throw new IllegalStateException();
  }

  public Object getFieldValue(int fieldId) {
    return getFieldValue(_Fields.findByThriftIdOrThrow(fieldId));
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case DOMAIN:
      return is_set_domain();
    }
    throw new IllegalStateException();
  }

  public boolean isSet(int fieldID) {
    return isSet(_Fields.findByThriftIdOrThrow(fieldID));
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainNotLoadedException)
      return this.equals((DomainNotLoadedException)that);
    return false;
  }

  public boolean equals(DomainNotLoadedException that) {
    if (that == null)
      return false;

    boolean this_present_domain = true && this.is_set_domain();
    boolean that_present_domain = true && that.is_set_domain();
    if (this_present_domain || that_present_domain) {
      if (!(this_present_domain && that_present_domain))
        return false;
      if (!this.domain.equals(that.domain))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_domain = true && (is_set_domain());
    builder.append(present_domain);
    if (present_domain)
      builder.append(domain);

    return builder.toHashCode();
  }

  public int compareTo(DomainNotLoadedException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DomainNotLoadedException typedOther = (DomainNotLoadedException)other;

    lastComparison = Boolean.valueOf(is_set_domain()).compareTo(typedOther.is_set_domain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_domain()) {      lastComparison = TBaseHelper.compareTo(this.domain, typedOther.domain);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // DOMAIN
          if (field.type == TType.STRING) {
            this.domain = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.domain != null) {
      oprot.writeFieldBegin(DOMAIN_FIELD_DESC);
      oprot.writeString(this.domain);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DomainNotLoadedException(");
    boolean first = true;

    sb.append("domain:");
    if (this.domain == null) {
      sb.append("null");
    } else {
      sb.append(this.domain);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!is_set_domain()) {
      throw new TProtocolException("Required field 'domain' is unset! Struct:" + toString());
    }

  }

}

