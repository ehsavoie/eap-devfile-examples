package org.jboss.microprofile.config.converter;

import org.eclipse.microprofile.config.spi.Converter;
import org.jboss.microprofile.config.converter.type.MicroProfileCustomValue;

public class MicroProfileCustomValueConverter implements Converter<MicroProfileCustomValue> {

    private static final long serialVersionUID = 1L;

    @Override
    public MicroProfileCustomValue convert(String value) {
        return new MicroProfileCustomValue(value);
    }
}
