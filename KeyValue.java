public class KeyValue {
    public String key;
    public String value;
    
    public KeyValue(String entry) {
        String[] pair = entry.split(":");
        this.key = pair[0].trim();
        this.value = pair[1].trim();
    }
    
    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}