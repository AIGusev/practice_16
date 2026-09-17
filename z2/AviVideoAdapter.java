package practice_16.z2;

public class AviVideoAdapter implements VideoAdapter{
    @Override
    public boolean ProverkaFormata(String format) {
        return format.equals("AVI");
    }

    @Override
    public Video convert(String path) {
        return null;
    }
}
