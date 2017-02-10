package com.jazs.highscore.dao.mapper;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.jazs.highscore.dao.model.ColoredCsvData;
import com.jazs.highscore.dao.model.ColoredLabel;

@Component
public class ColoredLabelMapper implements Function<ColoredCsvData, ColoredLabel> {

	@Override
	public ColoredLabel apply(ColoredCsvData data) {
		return new ColoredLabel(data.getLabel(), data.getColor());
	}

}