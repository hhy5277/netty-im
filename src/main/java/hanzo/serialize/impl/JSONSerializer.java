package hanzo.serialize.impl;

import com.alibaba.fastjson.JSON;
import hanzo.serialize.Serializer;
import hanzo.serialize.SerializerAlgorithm;

/**
 * JSONSerializer
 *
 * @author igaozp
 */
public class JSONSerializer implements Serializer {
    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
