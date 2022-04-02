package com.woo.cryptotransactions.entity.transform;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class ProductTypeConverter  implements AttributeConverter<ProductType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ProductType productType) {
        if (productType == null) {
            return null;
        }
        return productType.getValue();
    }

    @Override
    public ProductType convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }

        return Stream.of(ProductType.values())
                .filter(c -> c.getValue() == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
