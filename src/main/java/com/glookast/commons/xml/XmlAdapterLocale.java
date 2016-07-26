package com.glookast.commons.xml;

import java.util.Locale;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class XmlAdapterLocale extends XmlAdapter<String, Locale>
{

    @Override
    public Locale unmarshal(String value) throws Exception
    {
        return (java.util.Locale.forLanguageTag(value));
    }

    @Override
    public String marshal(Locale value) throws Exception
    {
        return (value.toLanguageTag());
    }

}
