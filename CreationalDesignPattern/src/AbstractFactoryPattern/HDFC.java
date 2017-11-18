/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author Amir
 */
public class HDFC implements Bank {

    private final String BNAME;

    public HDFC() {
        BNAME = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
