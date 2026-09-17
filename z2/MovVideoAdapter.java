package practice_16.z2;

public class MovVideoAdapter implements VideoAdapter{
    @Override
    public boolean ProverkaFormata(String format) {
        return format.equals("MOV");
    }

    @Override
    public Video convert(String path) {
        return null;
    }
}
