package fun.codefarmer.paramconverter.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 如果是其他类型，只需要提供其他类型转换器即可
 * @ @ClassName DataConverter
 * @ Descriotion TODO
 * @ Author admin
 * @ Date 2020/2/27 16:15
 **/
@Component
                                        //源数据类型，转换后的类型
public class DataConverter implements Converter<String, Date> {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @Override
    public Date convert(String s) {
        if (s != null && !"".equals(s)) {
            try {
                return sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
