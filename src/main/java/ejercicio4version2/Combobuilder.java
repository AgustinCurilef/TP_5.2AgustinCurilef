package ejercicio4version2;

public class Combobuilder {
    private ComboSimple comboSimple;
    private Combo comboFinal;

    public Combobuilder(ComboSimple comboSimple) {
        this.comboSimple = comboSimple;
        comboFinal= comboSimple;
    }
    public Combobuilder conQueso(){
        comboFinal= new Queso(this.comboFinal);
        return this;
    }
    public Combobuilder conPapas(){
        comboFinal= new Papas(this.comboFinal);
        return this;
    }
    public Combobuilder conTomate(){
        comboFinal= new Tomate(this.comboFinal);
        return  this;
    }
    public Combobuilder conCarne(){
        comboFinal= new Carne(this.comboFinal);
        return  this;
    }
    public Combo build(){
        return this.comboFinal;
    }
}
