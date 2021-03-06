package com.jazs.highscore.dao;

public class ColoredData {
	
	private final String label;
	private final String color;
	private final Integer id;
	
	
	public ColoredData(Integer id, String label, String color) {
		this.label = label;
		this.color = color;
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public String getColor() {
		return color;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ColoredData [label=" + label + ", color=" + color + ", id=" + id + "]";
	}
	
}
