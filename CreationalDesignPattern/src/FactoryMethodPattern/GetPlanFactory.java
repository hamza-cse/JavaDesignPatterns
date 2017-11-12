/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

/**
 *
 * @author Amir
 */
public class GetPlanFactory {

    public Plan getPlan(String planType) {

        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DomesticPlan")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("InstitutionalPlan")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
