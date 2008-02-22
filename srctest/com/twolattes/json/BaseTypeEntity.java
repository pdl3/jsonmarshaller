package com.twolattes.json;

import java.util.HashMap;
import java.util.Map;

@Entity
public class BaseTypeEntity {
  public static final Map<String, Class<?>> fields = new HashMap<String, Class<?>>();
  static {
    fields.put("_0", Integer.class);
    fields.put("_1", Character.class);
    fields.put("_2", Long.class);
    fields.put("_3", Float.class);
    fields.put("_4", Short.class);
    fields.put("_5", String.class);
    fields.put("_6", Boolean.class);
    fields.put("_7", Double.class);
  }

  @Value
  private int _0;

  @Value
  private char _1;

  @Value
  private long _2;

  @Value
  private float _3;

  @Value
  private short _4;

  @Value
  private String _5;

  @Value
  private boolean _6;

  @Value
  private double _7;

  public int get_0() {
    return _0;
  }

  public char get_1() {
    return _1;
  }

  public long get_2() {
    return _2;
  }

  public float get_3() {
    return _3;
  }

  public short get_4() {
    return _4;
  }

  public String get_5() {
    return _5;
  }

  public boolean is_6() {
    return _6;
  }

  public double get_7() {
    return _7;
  }
  
  public static class Factory {
    public BaseTypeEntity create(int p0, char p1, long p2, float p3, short p4, String p5, boolean p6, double p7) {
      BaseTypeEntity entity = new BaseTypeEntity();
      
      entity._0 = p0;
      entity._1 = p1;
      entity._2 = p2;
      entity._3 = p3;
      entity._4 = p4;
      entity._5 = p5;
      entity._6 = p6;
      entity._7 = p7;
      
      return entity;
    }
  }
}
