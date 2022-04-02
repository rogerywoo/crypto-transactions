package com.woo.cryptotransactions.entity.transform;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class TransactionTypeConverter implements AttributeConverter<TransactionType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(TransactionType transactionType) {
        if (transactionType == null) {
            return null;
        }
        return transactionType.getValue();
    }

    @Override
    public TransactionType convertToEntityAttribute(Integer value) {
        if (value == null) {
            return null;
        }

        return Stream.of(TransactionType.values())
                .filter(c -> c.getValue() == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
