package org.learn.clases.actividad302;

class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public String getInfoMotor() {
        return "Potencia: " + potencia + "CV, Tipo: " + tipo;
    }
}
