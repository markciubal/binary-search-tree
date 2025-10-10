public class KeyValue(String entry){
    public String key;
    public String value;
    String[] pair = entry.split(":");
    this.key = pair[0].trim();
    this.value = pair[1].trim();
}