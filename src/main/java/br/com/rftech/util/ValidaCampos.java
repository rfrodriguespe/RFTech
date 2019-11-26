/*
 * The MIT License
 *
 * Copyright 2019 Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package br.com.rftech.util;

/**
 *
 * @author Rodrigo Ferreira Rodrigues <https://github.com/rfrodriguespe>
 */
public class ValidaCampos {
    
    private static ValidaCampos uniqueInstance;

    private ValidaCampos() {

    }

    /**
     *
     * @return
     */
    public static synchronized ValidaCampos getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ValidaCampos();
        }
        return uniqueInstance;
    }
    
    
     /**
     *
     * @param cnpj Brazilian number CNPJ at format ##.###.###/####-## or ##############
     * @return Returns True when is a valid Brazilian CNPJ or false when it
     * isn't.
     */
    public boolean isCnpj(String cnpj) {
        return validateCnpj(cnpj);
    }
    
    private boolean validateCnpj(String cnpj) {
        /**
         * Removing nonnumeric characters
         */
        cnpj = cnpj.replace(".", "").replace("/", "").replace("-", "");
         
        /**
         * Brazilian CNPJ has 14 digits length, anything different, it's invalid
         * number
         */
        if (cnpj.length() != 14) {
            return false;
        }
        
        /**
         * Variables declaration's wich will be used by Method.
         */
        String firstPart = cnpj.substring(0, 12);
        String secondPart = cnpj.substring(0, 13);
        String div1FirstPart = cnpj.substring(0, 4);
        String div2FirstPart = cnpj.substring(4, 12);
        String div1SecondPart = cnpj.substring(0, 5);
        String div2SecondPart = cnpj.substring(5, 13);
        int firstDigit = Integer.parseInt(cnpj.substring(12, 13));
        int secondDigit = Integer.parseInt(cnpj.substring(13, 14));
        int firstSum = 0;
        int secondSum = 0;
        int div1FirstSum = 0;
        int div2FirstSum = 0;
        int div1SegSum = 0;
        int div2SegSum = 0;
        int firstDigitCalculated = 9999;
        int secondDigitCalculated = 9999;
        
       

        /**
         * First Digit Calculation
         */
        int cont = 5;
        for (int i = 0; i < div1FirstPart.length(); i++) {
            div1FirstSum += Character.getNumericValue(div1FirstPart.charAt(i)) * cont;
            cont--;
        }
        int cont2 = 9;
        for (int i = 0; i < div2FirstPart.length(); i++) {
            div2FirstSum += Character.getNumericValue(div2FirstPart.charAt(i)) * cont2;
            cont2--;
        }
        firstSum = div1FirstSum + div2FirstSum;

        
        if (firstSum % 11 < 2) {
            firstDigitCalculated = 0;
        } else {
            firstDigitCalculated = 11 - firstSum % 11;
        }

        /**
         * Second Digit Calculation
         */
        int cont3 = 6;
        for (int i = 0; i < div1SecondPart.length(); i++) {
            div1SegSum += Character.getNumericValue(div1SecondPart.charAt(i)) * cont3;
            cont3--;
        }
        int cont4 = 9;
        for (int i = 0; i < div2SecondPart.length(); i++) {
            div2SegSum += Character.getNumericValue(div2SecondPart.charAt(i)) * cont4;
            cont4--;
        }
        secondSum = div1SegSum + div2SegSum;

        
        if (secondSum % 11 < 2) {
            secondDigitCalculated = 0;
        } else {
            secondDigitCalculated = 11 - secondSum % 11;
        }
        
        /**
         * Result
         */
        return firstDigit == firstDigitCalculated && secondDigit == secondDigitCalculated;

    }
    
    /**
     *
     * @param cpf Brazilian number CPF at format ###.###.###-## or ###########
     * @return Returns True when is a valid Brazilian CPF or false when it
     * isn't.
     */
    public boolean isCpf(String cpf) {
        /**
         * Removing nonnumeric characters
         */
        cpf = cpf.replace(".", "").replace("-", "");
        long test;
        try {
            test = Long.parseLong(cpf);
        } catch (NumberFormatException e) {
            return false;
        } finally {
            return validateCpf(cpf);
        }
    }

    private boolean validateCpf(String cpf) {

        /**
         * Brazilian CPF has 11 digits length, anything different, it's invalid
         * number
         */
        if (cpf.equals("00000000000") || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return false;
        }

        /**
         * Variables declaration's wich will be used by Method.
         */
        String firstPartCpf = cpf.substring(0, 9);
        String secodPartCpf = cpf.substring(0, 10);
        int firstDigit = Integer.parseInt(cpf.substring(9, 10));
        int secondDigit = Integer.parseInt(cpf.substring(10, 11));
        int firstSum = 0;
        int secondSum = 0;
        int firsDigitCalculated = 9999;
        int secondDigitCalculated = 9999;

        /**
         * First Digit Calculation
         */
        int cont = 10;
        for (int i = 0; i < firstPartCpf.length(); i++) {
            firstSum += Character.getNumericValue(firstPartCpf.charAt(i)) * cont;
            cont--;
        }

        if (firstSum % 11 < 2) {
            firsDigitCalculated = 0;
        } else {
            firsDigitCalculated = 11 - firstSum % 11;
        }

        /**
         * Second Digit Calculation
         */
        int cont2 = 11;
        for (int i = 0; i < secodPartCpf.length(); i++) {
            secondSum += Character.getNumericValue(secodPartCpf.charAt(i)) * cont2;
            cont2--;
        }

        if (secondSum % 11 < 2) {
            secondDigitCalculated = 0;
        } else {
            secondDigitCalculated = 11 - secondSum % 11;
        }

        /**
         * Validation of check digits
         */
        return firstDigit == firsDigitCalculated && secondDigit == secondDigitCalculated;
    }
    
}
