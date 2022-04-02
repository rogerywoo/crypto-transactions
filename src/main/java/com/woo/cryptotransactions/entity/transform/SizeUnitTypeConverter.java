package com.woo.cryptotransactions.entity.transform;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class SizeUnitTypeConverter implements AttributeConverter<SizeUnitType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(SizeUnitType productType) {
        if (productType == null) {
            return null;
        }
        return productType.getValue();
    }

    @Override
    public SizeUnitType convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }

        return Stream.of(SizeUnitType.values())
                .filter(c -> c.getValue() == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
