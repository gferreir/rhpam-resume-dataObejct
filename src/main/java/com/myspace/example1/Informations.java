package com.myspace.example1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Informations implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Observation")
	private java.lang.String observation;
	@org.kie.api.definition.type.Label(value = "Allow")
	private java.lang.Boolean allow;

	public Informations() {
	}

	public java.lang.String getObservation() {
		return this.observation;
	}

	public void setObservation(java.lang.String observation) {
		this.observation = observation;
	}

	public java.lang.Boolean getAllow() {
		return this.allow;
	}

	public void setAllow(java.lang.Boolean allow) {
		this.allow = allow;
	}

	public Informations(java.lang.String observation, java.lang.Boolean allow) {
		this.observation = observation;
		this.allow = allow;
	}

}