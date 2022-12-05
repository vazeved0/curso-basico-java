public class SmartTv {

    boolean ligada;
    int canal;
    int volume;

    SmartTv() {
        volume = 1;
        canal = 7;
        ligada = false;
    }

    public boolean ligar() {
        ligada = !ligada;
        return ligada;
    }

    public int trocarCanal(int numero) {
        if (ligada) {
            canal = numero;
            return canal;
        } else {
            System.out.println("TV desligada");
            return 0;

        }
    }

    public int trocarCanalMais() {
        if (ligada) {
            canal++;
            return canal;
        } else {
            System.out.println("TV desligada");
            return 0;
        }
    }

    public int trocarCanalMenos() {
        if (ligada) {
            canal--;
            return canal;
        } else {
            System.out.println("TV desligada");
            return 0;
        }
    }

    public int aumentarVolume() {
        if (ligada) {
            volume++;
            return volume;
        } else {
            System.out.println("TV desligada");
            return 0;
        }
    }

    public int diminuirVolume() {
        if (ligada) {
            volume--;
            return volume;
        } else {
            System.out.println("TV desligada");
            return 0;
        }
    }

}
