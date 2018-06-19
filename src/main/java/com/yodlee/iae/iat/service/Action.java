package com.yodlee.iae.iat.service;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum Action {

	  SR_DETAIL(1, "sr_detail"),

	  SIMILARISSUE(2, "similarissue"),

	  ANALYSIS(3, "analysis"),

	  USER_AGG_ACC(4, "usr_agg_acc"),
	  
	  OUT_COME(5, "outcome")
	  ;

	  private int id;

	  private String name;

	  /**
	   * @param id
	   * @param name
	   */
	  private Action(final int id, final String name) {
	    this.id = id;
	    this.name = name;
	  }

	  /**
	   * @return the Id
	   */
	  @JsonValue
	  public int getId() {
	    return this.id;
	  }

	  /**
	   * @return the name
	   */
	  public String getName() {
	    return this.name;
	  }

	  /**
	   * @return
	   */
	  public static Map<Integer, String> toMap() {
	    final Map<Integer, String> types = new HashMap<>();
	    for (final Action type : Action.values()) {
	      types.put(type.getId(), type.getName());
	    }
	    return types;
	  }

	  /**
	   * @param id
	   * @return
	   */
	  @JsonCreator
	  public static Action fromId(final int id) {
	    for (final Action type : Action.values()) {
	      if (type.getId() == id) {
	        return type;
	      }
	    }
	    return null;
	  }

}
