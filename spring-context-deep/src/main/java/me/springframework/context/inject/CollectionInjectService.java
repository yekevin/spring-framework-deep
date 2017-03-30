package me.springframework.context.inject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Kevin
 * @description 集合注入
 * @date 2017/3/30
 */
public class CollectionInjectService {

    private Properties properties;

    private List<String> lists;

    private Map<String,String> maps;

    private Set<String> sets;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Properties getProperties() {
        return properties;
    }

    public List<String> getLists() {
        return lists;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public Set<String> getSets() {
        return sets;
    }
}
