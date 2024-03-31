package jpa.core.specialContact.dto;

import lombok.Getter;

@Getter
public class ResponseInsuranceFee {

    private String type;
    private Integer monthlyFee;
    private Integer birth;
    private Integer initialFee;
    private Integer diagnosisFee;
    private Integer surgeryFee;
    private Integer treatmentFee;

    public ResponseInsuranceFee(String type, Integer monthlyFee, Integer birth, Integer initialFee,
        Integer diagnosisFee, Integer surgeryFee, Integer treatmentFee) {
        this.type = type;
        this.monthlyFee = monthlyFee;
        this.birth = birth;
        this.initialFee = initialFee;
        this.diagnosisFee = diagnosisFee;
        this.surgeryFee = surgeryFee;
        this.treatmentFee = treatmentFee;
    }
}
