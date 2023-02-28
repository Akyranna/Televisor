public class televisor {

    private int VOLUME;
    private int CANAL;

    public int getVolume() {
        return VOLUME;
    }

    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 100) {
                this.VOLUME = volume;
            }else {
                throw new Exception("Volume fora da faixa permitida.");
            }
        }catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
    public int getCanal() {
        return CANAL;
    }
    public void setCanal(int canal) {

        try {
            if (canal >= 0 && canal <= 150) {
                this.CANAL = canal;

            }else {
                throw new Exception("Esse canal não existe.");
            }
        }catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }
    public void AumentarVolume() {
        VOLUME++;
    }
    public void DiminuirVolume() {
        VOLUME--;
    }
    public void TrocarCanal(int c) {
        CANAL=c;
    }
    public void mostra () {
        System.out.println("volume:"+ VOLUME + "\ncanal:"+ CANAL);
    }
}