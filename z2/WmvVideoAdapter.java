package practice_16.z2;

public class WmvVideoAdapter implements VideoAdapter{
    @Override
    public boolean ProverkaFormata(String format) {
        return format.equals("WMV");
    }

    @Override
    public Video convert(String path) {
        return null;
    }
}
