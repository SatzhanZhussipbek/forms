package com.company.orgforms.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "FORM_")
@Entity(name = "Form_")
public class Form {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    private Date dateOfBirth;

    @Column(name = "GRADE")
    private Integer grade;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "SPECIAL_NEEDS")
    private Integer specialNeeds;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSE")
    private String house;

    @Column(name = "APARTMENT")
    private String apartment;

    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;

    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "FATHER_BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date fatherBirthdate;

    @Column(name = "FATHER_AGE")
    private Integer fatherAge;

    @Column(name = "FATHER_FAMILY_STATUS")
    private Integer fatherFamilyStatus;

    @Column(name = "FATHER_CITY")
    private String fatherCity;

    @Column(name = "FATHER_DISTRICT")
    private String fatherDistrict;

    @Column(name = "FATHER_STREET")
    private String fatherStreet;

    @Column(name = "FATHER_HOUSE")
    private String fatherHouse;

    @Column(name = "FATHER_APARTMENT")
    private String fatherApartment;

    @Column(name = "MOTHER_NAME")
    private String motherName;

    @Column(name = "MOTHER_BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date motherBirthdate;

    @Column(name = "MOTHER_AGE")
    private Integer motherAge;

    @Column(name = "MOTHER_FAMILY_STATUS")
    private String motherFamilyStatus;

    @Column(name = "MOTHER_CITY")
    private String motherCity;

    @Column(name = "MOTHER_DISTRICT")
    private String motherDistrict;

    @Column(name = "MOTHER_STREET")
    private String motherStreet;

    @Column(name = "MOTHER_HOUSE")
    private String motherHouse;

    @Column(name = "MOTHER_APARTMENT")
    private String motherApartment;

    @Column(name = "STEP_PARENT")
    private Boolean stepParent;

    @Column(name = "OTHER_NAME")
    private String otherName;

    @Column(name = "OTHER_AGE")
    private String otherAge;

    @Column(name = "OTHER_KINSHIP_DEGREE")
    private String otherKinshipDegree;

    @Column(name = "OTHER_WORKPLACE")
    private String otherWorkplace;

    @Column(name = "INTERVIEW_DATE")
    @Temporal(TemporalType.DATE)
    private Date interviewDate;

    @Column(name = "INTERVIEWEE_NAME")
    private String intervieweeName;

    @Column(name = "INTERVIEW_ORG")
    private String interviewOrg;

    @Column(name = "RELATION_TO_INTERVIEWEE")
    private String relationToInterviewee;

    @Column(name = "INTERVIEWEE_CONTACT")
    private String intervieweeContact;

    @Column(name = "LEGAL_PROBLEMS")
    private Boolean legalProblems;

    @Column(name = "ATTENDANCE")
    private Boolean attendance;

    @Column(name = "RISK_CONFLICT")
    private Boolean riskConflict;

    @Column(name = "EARLY_PREGNANCY")
    private Boolean earlyPregnancy;

    @Column(name = "DISABILITY")
    private Boolean disability;

    @Column(name = "HAS_HIV")
    private Boolean hasHIV;

    @Column(name = "NUTRITION")
    private Boolean nutrition;

    @Column(name = "HAS_SEASON_CLOTHES")
    private Boolean hasSeasonClothes;

    @Column(name = "NO_CAREGIVER_RISK")
    private Boolean noCaregiverRisk;

    @Column(name = "OTHER")
    private String other;

    @Column(name = "CHILD_LABOR")
    private Boolean childLabor;

    @Column(name = "DOMESTIC_VIOLENCE")
    private Boolean domesticViolence;

    @Column(name = "CHILD_ABUSE")
    private Boolean childAbuse;

    @Column(name = "BEEN_ORPHAN")
    private Boolean beenOrphan;

    @Column(name = "PSYCH_DISEASE")
    private Boolean psychDisease;

    @Column(name = "EXPLOITATION")
    private Boolean exploitation;

    @Column(name = "RELIGIOUS_RADICALISM")
    private Boolean religiousRadicalism;

    @Column(name = "CONFLICT_ZONE")
    private Boolean conflictZone;

    @Column(name = "OUTSIDE_FAMILY")
    private Boolean outsideFamily;

    @Column(name = "SELF_DAMAGE")
    private Boolean selfDamage;

    @Column(name = "RISKY_BEHAVIOR")
    private Boolean riskyBehavior;

    @Column(name = "SUICIDAL")
    private Boolean suicidal;

    @Column(name = "GRIEF_OF_LOSS")
    private Boolean griefOfLoss;

    @Column(name = "BULLYING")
    private Boolean bullying;

    @Column(name = "STRESS_TRAUMA")
    private Boolean stressTrauma;

    @Column(name = "DEVELOPMENTAL_PROBLEM")
    private Boolean developmentalProblem;

    @Column(name = "WEAK_SELF_SERVICE")
    private Boolean weakSelfService;

    @Column(name = "PSYCH_EMOTIONAL_PROBLEMS")
    private Boolean psychEmotionalProblems;

    @Column(name = "OTHER_PROBLEMS")
    private String otherProblems;

    @Column(name = "FREQUENT_ABSENCE")
    private Boolean frequentAbsence;

    @Column(name = "BAD_GRADES")
    private Boolean badGrades;

    @Column(name = "HEALTH_ABSENCE")
    private Boolean healthAbsence;

    @Column(name = "LACK_OF_PROVISION")
    private Boolean lackOfProvision;

    @Column(name = "NO_FAMILY_CONTROL")
    private Boolean noFamilyControl;

    @Column(name = "NO_SCHOOL_HELP")
    private Boolean noSchoolHelp;

    @Column(name = "REJECTION_OF_HELP")
    private Boolean rejectionOfHelp;

    @Column(name = "POOR_QUALITY_OF_HELP")
    private Boolean poorQualityOfHelp;

    @Column(name = "TEACHER_PARENT_CONFLICT")
    private Boolean teacherParentConflict;

    @Column(name = "CHILD_TEACHER_CONFLICT")
    private Boolean childTeacherConflict;

    @Column(name = "OTHER_NOTES")
    private String otherNotes;

    @Column(name = "LARGE_FAMILY")
    private Boolean largeFamily;

    @Column(name = "FAMILY_CONFLICTS")
    private Boolean familyConflicts;

    @Column(name = "POOR_FAMILY")
    private Boolean poorFamily;

    @Column(name = "PARENTS_MIGRANT_WORKERS")
    private Boolean parentsMigrantWorkers;

    @Column(name = "FAMILY_ALCOHOL_PROBLEM")
    private Boolean familyAlcoholProblem;

    @Column(name = "OLD_PARENTS")
    private Boolean oldParents;

    @Column(name = "FAMILY_EX_CONVICT")
    private Boolean familyExConvict;

    @Column(name = "PREGNANT_MOTHERS")
    private Boolean pregnantMothers;

    @Column(name = "HOMELESS_PARENTS")
    private Boolean homelessParents;

    @Column(name = "SINGLE_PARENT_FAMILY")
    private Boolean singleParentFamily;

    @Column(name = "LOW_EDUCATION")
    private Boolean lowEducation;

    @Column(name = "PARENT_BEEN_ORPHAN")
    private Boolean parentBeenOrphan;

    @Column(name = "WEAK_PARENTAL_SKILLS")
    private Boolean weakParentalSkills;

    @Column(name = "LACK_OF_SOCIAL_SUPPORT")
    private Boolean lackOfSocialSupport;

    @Column(name = "ATTACHMENT_DISORDER")
    private Boolean attachmentDisorder;

    @Column(name = "SOCIAL_ISOLATION")
    private Boolean socialIsolation;

    @Column(name = "DIVORCED")
    private Boolean divorced;

    @Column(name = "ACCESS_TO_SERVICE")
    private Boolean accessToService;

    @Column(name = "BAD_HOUSING")
    private Boolean badHousing;

    @Column(name = "FAMILY_DISCRIMINATED")
    private Boolean familyDiscriminated;

    @Column(name = "LACK_OF_MEDICINE")
    private Boolean lackOfMedicine;

    @Column(name = "UNEMPLOYED_FAMILY_MEMBER")
    private Boolean unemployedFamilyMember;

    @Column(name = "LACK_OF_TRANSPORT")
    private Boolean lackOfTransport;

    @Column(name = "FAMILY_WITH_HIV")
    private Boolean familyWithHIV;

    @Column(name = "MONEY_PROBLEMS")
    private Boolean moneyProblems;

    @Column(name = "DISABLED_PARENT")
    private Boolean disabledParent;

    @Column(name = "SUPPORT_OF_VIOLENCE")
    private Boolean supportOfViolence;

    @Column(name = "WARZONE_RETURNEE")
    private Boolean warzoneReturnee;

    @Column(name = "PROBLEM_WITH_PSYCH")
    private Boolean problemWithPsych;

    @Column(name = "RADICALISM_OF_PARENT")
    private Boolean radicalismOfParent;

    @Column(name = "OTHER_FAMILY_PROBLEMS")
    private String otherFamilyProblems;

    @Column(name = "ACADEMIC_ACHIEVEMENT")
    private Boolean academicAchievement;

    @Column(name = "FAMILY_RULES")
    private Boolean familyRules;

    @Column(name = "GOOD_SOCIAL_SKILLS")
    private Boolean goodSocialSkills;

    @Column(name = "CARING_ADULTS")
    private Boolean caringAdults;

    @Column(name = "PROACTIVE_IN_OWN")
    private Boolean proactiveInOwn;

    @Column(name = "SUPPORTIVE_FAMILY")
    private Boolean supportiveFamily;

    @Column(name = "POSITIVE_ATTITUDE")
    private Boolean positiveAttitude;

    @Column(name = "OTHER_INDIVIDUAL_FACTORS")
    private Boolean otherIndividualFactors;

    @Column(name = "OTHER_FAMILIAL_FACTORS")
    private String otherFamilialFactors;

    @Column(name = "SECURE_ATTACHMENT")
    private Boolean secureAttachment;

    @Column(name = "ECONOMIC_STABILITY")
    private Boolean economicStability;

    @Column(name = "CARING_PARENT")
    private Boolean caringParent;

    @Column(name = "EMPLOYED_PARENTS")
    private Boolean employedParents;

    @Column(name = "STABLE_FAMILY")
    private Boolean stableFamily;

    @Column(name = "EDUCATED_PARENTS")
    private Boolean educatedParents;

    @Column(name = "GOOD_PARENTAL_SKILLS")
    private Boolean goodParentalSkills;

    @Column(name = "GOOD_HOUSING")
    private Boolean goodHousing;

    @Column(name = "POSITIVE_FAMILY")
    private Boolean positiveFamily;

    @Column(name = "SOCIAL_SUPPORT")
    private Boolean socialSupport;

    @Column(name = "BASIC_NEEDS")
    private Boolean basicNeeds;

    @Column(name = "MEDICAL_ACCESS")
    private Boolean medicalAccess;

    @Column(name = "STABLE_RELATIONSHIP")
    private Boolean stableRelationship;

    @Column(name = "RESOURCE_SERVICE_COORDINATION")
    private Boolean resourceServiceCoordination;

    @Column(name = "OTHER_ENV_FACTORS")
    private String otherEnvFactors;

    @Column(name = "SAFE_SCHOOL")
    private Boolean safeSchool;

    @Column(name = "PROGRAMS_FOR_PARENTS")
    private Boolean programsForParents;

    @Column(name = "EXTRA_CURRICULARS")
    private Boolean extraCurriculars;

    @Column(name = "INCLUSIVE_APPROACH")
    private Boolean inclusiveApproach;

    @Column(name = "AVAILABLE_NPA")
    private Boolean availableNPA;

    @Column(name = "ART_CIRCLE_AVAILABLE")
    private Boolean artCircleAvailable;

    @Column(name = "MENTORING")
    private Boolean mentoring;

    @Column(name = "PREVENTION_PROGRAMS")
    private Boolean preventionPrograms;

    @Column(name = "OTHER_SCHOOL_FACTORS")
    private String otherSchoolFactors;

    @Column(name = "CASE_COMMENTS")
    private String caseComments;

    @Column(name = "NO_RISK_LEVEL")
    private Boolean noRiskLevel;

    @Column(name = "NO_RISK_STEP1")
    private Boolean noRiskStep1;

    @Column(name = "NO_RISK_STEP2")
    private Boolean noRiskStep2;

    @Column(name = "NO_RISK_STEP3")
    private Boolean noRiskStep3;

    @Column(name = "NO_RISK_OTHER")
    private String noRiskOther;

    @Column(name = "LOW_RISK_LEVEL")
    private Boolean lowRiskLevel;

    @Column(name = "LOW_RISK_LEVEL_STEP1")
    private Boolean lowRiskLevelStep1;

    @Column(name = "LOW_RISK_LEVEL_STEP2")
    private Boolean lowRiskLevelStep2;

    @Column(name = "LOW_RISK_LEVEL_OTHER")
    private String lowRiskLevelOther;

    @Column(name = "MEDIUM_RISK_LEVEL")
    private Boolean mediumRiskLevel;

    @Column(name = "MEDIUM_RISK_LEVEL_STEP1")
    private Boolean mediumRiskLevelStep1;

    @Column(name = "MEDIUM_RISK_LEVEL_STEP2")
    private Boolean mediumRiskLevelStep2;

    @Column(name = "MEDIUM_RISK_OTHER")
    private String mediumRiskOther;

    @Column(name = "HIGH_RISK_LEVEL")
    private Boolean highRiskLevel;

    @Column(name = "HIGH_RISK_STEP1")
    private Boolean highRiskStep1;

    @Column(name = "HIGH_RISK_STEP2")
    private Boolean highRiskStep2;

    @Column(name = "HIGH_RISK_STEP3")
    private Boolean highRiskStep3;

    @Column(name = "HIGH_RISK_STEP4")
    private Boolean highRiskStep4;

    @Column(name = "HIGH_RISK_STEP5")
    private Boolean highRiskStep5;

    @Column(name = "HIGH_RISK_STEP6")
    private Boolean highRiskStep6;

    @Column(name = "HIGH_RISK_STEP_OTHER")
    private String highRiskStepOther;

    public void setHasHIV(Boolean hasHIV) {
        this.hasHIV = hasHIV;
    }

    public Boolean getHasHIV() {
        return hasHIV;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOther() {
        return other;
    }

    public void setChildAbuse(Boolean childAbuse) {
        this.childAbuse = childAbuse;
    }

    public Boolean getChildAbuse() {
        return childAbuse;
    }

    public void setSuicidal(Boolean suicidal) {
        this.suicidal = suicidal;
    }

    public Boolean getSuicidal() {
        return suicidal;
    }

    public void setOtherProblems(String otherProblems) {
        this.otherProblems = otherProblems;
    }

    public String getOtherProblems() {
        return otherProblems;
    }

    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
    }

    public String getOtherNotes() {
        return otherNotes;
    }

    public void setOtherFamilyProblems(String otherFamilyProblems) {
        this.otherFamilyProblems = otherFamilyProblems;
    }

    public String getOtherFamilyProblems() {
        return otherFamilyProblems;
    }

    public void setOtherFamilialFactors(String otherFamilialFactors) {
        this.otherFamilialFactors = otherFamilialFactors;
    }

    public String getOtherFamilialFactors() {
        return otherFamilialFactors;
    }

    public void setOtherEnvFactors(String otherEnvFactors) {
        this.otherEnvFactors = otherEnvFactors;
    }

    public String getOtherEnvFactors() {
        return otherEnvFactors;
    }

    public void setOtherSchoolFactors(String otherSchoolFactors) {
        this.otherSchoolFactors = otherSchoolFactors;
    }

    public String getOtherSchoolFactors() {
        return otherSchoolFactors;
    }

    public String getHighRiskStepOther() {
        return highRiskStepOther;
    }

    public void setHighRiskStepOther(String highRiskStepOther) {
        this.highRiskStepOther = highRiskStepOther;
    }

    public Boolean getHighRiskStep6() {
        return highRiskStep6;
    }

    public void setHighRiskStep6(Boolean highRiskStep6) {
        this.highRiskStep6 = highRiskStep6;
    }

    public Boolean getHighRiskStep5() {
        return highRiskStep5;
    }

    public void setHighRiskStep5(Boolean highRiskStep5) {
        this.highRiskStep5 = highRiskStep5;
    }

    public Boolean getHighRiskStep4() {
        return highRiskStep4;
    }

    public void setHighRiskStep4(Boolean highRiskStep4) {
        this.highRiskStep4 = highRiskStep4;
    }

    public Boolean getHighRiskStep3() {
        return highRiskStep3;
    }

    public void setHighRiskStep3(Boolean highRiskStep3) {
        this.highRiskStep3 = highRiskStep3;
    }

    public Boolean getHighRiskStep2() {
        return highRiskStep2;
    }

    public void setHighRiskStep2(Boolean highRiskStep2) {
        this.highRiskStep2 = highRiskStep2;
    }

    public Boolean getHighRiskStep1() {
        return highRiskStep1;
    }

    public void setHighRiskStep1(Boolean highRiskStep1) {
        this.highRiskStep1 = highRiskStep1;
    }

    public Boolean getHighRiskLevel() {
        return highRiskLevel;
    }

    public void setHighRiskLevel(Boolean highRiskLevel) {
        this.highRiskLevel = highRiskLevel;
    }

    public String getMediumRiskOther() {
        return mediumRiskOther;
    }

    public void setMediumRiskOther(String mediumRiskOther) {
        this.mediumRiskOther = mediumRiskOther;
    }

    public Boolean getMediumRiskLevelStep2() {
        return mediumRiskLevelStep2;
    }

    public void setMediumRiskLevelStep2(Boolean mediumRiskLevelStep2) {
        this.mediumRiskLevelStep2 = mediumRiskLevelStep2;
    }

    public Boolean getMediumRiskLevelStep1() {
        return mediumRiskLevelStep1;
    }

    public void setMediumRiskLevelStep1(Boolean mediumRiskLevelStep1) {
        this.mediumRiskLevelStep1 = mediumRiskLevelStep1;
    }

    public Boolean getMediumRiskLevel() {
        return mediumRiskLevel;
    }

    public void setMediumRiskLevel(Boolean mediumRiskLevel) {
        this.mediumRiskLevel = mediumRiskLevel;
    }

    public String getLowRiskLevelOther() {
        return lowRiskLevelOther;
    }

    public void setLowRiskLevelOther(String lowRiskLevelOther) {
        this.lowRiskLevelOther = lowRiskLevelOther;
    }

    public Boolean getLowRiskLevelStep2() {
        return lowRiskLevelStep2;
    }

    public void setLowRiskLevelStep2(Boolean lowRiskLevelStep2) {
        this.lowRiskLevelStep2 = lowRiskLevelStep2;
    }

    public Boolean getLowRiskLevelStep1() {
        return lowRiskLevelStep1;
    }

    public void setLowRiskLevelStep1(Boolean lowRiskLevelStep1) {
        this.lowRiskLevelStep1 = lowRiskLevelStep1;
    }

    public Boolean getLowRiskLevel() {
        return lowRiskLevel;
    }

    public void setLowRiskLevel(Boolean lowRiskLevel) {
        this.lowRiskLevel = lowRiskLevel;
    }

    public String getNoRiskOther() {
        return noRiskOther;
    }

    public void setNoRiskOther(String noRiskOther) {
        this.noRiskOther = noRiskOther;
    }

    public Boolean getNoRiskStep3() {
        return noRiskStep3;
    }

    public void setNoRiskStep3(Boolean noRiskStep3) {
        this.noRiskStep3 = noRiskStep3;
    }

    public Boolean getNoRiskStep2() {
        return noRiskStep2;
    }

    public void setNoRiskStep2(Boolean noRiskStep2) {
        this.noRiskStep2 = noRiskStep2;
    }

    public Boolean getNoRiskStep1() {
        return noRiskStep1;
    }

    public void setNoRiskStep1(Boolean noRiskStep1) {
        this.noRiskStep1 = noRiskStep1;
    }

    public Boolean getNoRiskLevel() {
        return noRiskLevel;
    }

    public void setNoRiskLevel(Boolean noRiskLevel) {
        this.noRiskLevel = noRiskLevel;
    }

    public String getCaseComments() {
        return caseComments;
    }

    public void setCaseComments(String caseComments) {
        this.caseComments = caseComments;
    }

    public Boolean getPreventionPrograms() {
        return preventionPrograms;
    }

    public void setPreventionPrograms(Boolean preventionPrograms) {
        this.preventionPrograms = preventionPrograms;
    }

    public Boolean getMentoring() {
        return mentoring;
    }

    public void setMentoring(Boolean mentoring) {
        this.mentoring = mentoring;
    }

    public Boolean getArtCircleAvailable() {
        return artCircleAvailable;
    }

    public void setArtCircleAvailable(Boolean artCircleAvailable) {
        this.artCircleAvailable = artCircleAvailable;
    }

    public Boolean getAvailableNPA() {
        return availableNPA;
    }

    public void setAvailableNPA(Boolean availableNPA) {
        this.availableNPA = availableNPA;
    }

    public Boolean getInclusiveApproach() {
        return inclusiveApproach;
    }

    public void setInclusiveApproach(Boolean inclusiveApproach) {
        this.inclusiveApproach = inclusiveApproach;
    }

    public Boolean getExtraCurriculars() {
        return extraCurriculars;
    }

    public void setExtraCurriculars(Boolean extraCurriculars) {
        this.extraCurriculars = extraCurriculars;
    }

    public Boolean getProgramsForParents() {
        return programsForParents;
    }

    public void setProgramsForParents(Boolean programsForParents) {
        this.programsForParents = programsForParents;
    }

    public Boolean getSafeSchool() {
        return safeSchool;
    }

    public void setSafeSchool(Boolean safeSchool) {
        this.safeSchool = safeSchool;
    }

    public Boolean getResourceServiceCoordination() {
        return resourceServiceCoordination;
    }

    public void setResourceServiceCoordination(Boolean resourceServiceCoordination) {
        this.resourceServiceCoordination = resourceServiceCoordination;
    }

    public Boolean getStableRelationship() {
        return stableRelationship;
    }

    public void setStableRelationship(Boolean stableRelationship) {
        this.stableRelationship = stableRelationship;
    }

    public Boolean getMedicalAccess() {
        return medicalAccess;
    }

    public void setMedicalAccess(Boolean medicalAccess) {
        this.medicalAccess = medicalAccess;
    }

    public Boolean getBasicNeeds() {
        return basicNeeds;
    }

    public void setBasicNeeds(Boolean basicNeeds) {
        this.basicNeeds = basicNeeds;
    }

    public Boolean getSocialSupport() {
        return socialSupport;
    }

    public void setSocialSupport(Boolean socialSupport) {
        this.socialSupport = socialSupport;
    }

    public Boolean getPositiveFamily() {
        return positiveFamily;
    }

    public void setPositiveFamily(Boolean positiveFamily) {
        this.positiveFamily = positiveFamily;
    }

    public Boolean getGoodHousing() {
        return goodHousing;
    }

    public void setGoodHousing(Boolean goodHousing) {
        this.goodHousing = goodHousing;
    }

    public Boolean getGoodParentalSkills() {
        return goodParentalSkills;
    }

    public void setGoodParentalSkills(Boolean goodParentalSkills) {
        this.goodParentalSkills = goodParentalSkills;
    }

    public Boolean getEducatedParents() {
        return educatedParents;
    }

    public void setEducatedParents(Boolean educatedParents) {
        this.educatedParents = educatedParents;
    }

    public Boolean getStableFamily() {
        return stableFamily;
    }

    public void setStableFamily(Boolean stableFamily) {
        this.stableFamily = stableFamily;
    }

    public Boolean getEmployedParents() {
        return employedParents;
    }

    public void setEmployedParents(Boolean employedParents) {
        this.employedParents = employedParents;
    }

    public Boolean getCaringParent() {
        return caringParent;
    }

    public void setCaringParent(Boolean caringParent) {
        this.caringParent = caringParent;
    }

    public Boolean getEconomicStability() {
        return economicStability;
    }

    public void setEconomicStability(Boolean economicStability) {
        this.economicStability = economicStability;
    }

    public Boolean getSecureAttachment() {
        return secureAttachment;
    }

    public void setSecureAttachment(Boolean secureAttachment) {
        this.secureAttachment = secureAttachment;
    }

    public Boolean getOtherIndividualFactors() {
        return otherIndividualFactors;
    }

    public void setOtherIndividualFactors(Boolean otherIndividualFactors) {
        this.otherIndividualFactors = otherIndividualFactors;
    }

    public Boolean getPositiveAttitude() {
        return positiveAttitude;
    }

    public void setPositiveAttitude(Boolean positiveAttitude) {
        this.positiveAttitude = positiveAttitude;
    }

    public Boolean getSupportiveFamily() {
        return supportiveFamily;
    }

    public void setSupportiveFamily(Boolean supportiveFamily) {
        this.supportiveFamily = supportiveFamily;
    }

    public Boolean getProactiveInOwn() {
        return proactiveInOwn;
    }

    public void setProactiveInOwn(Boolean proactiveInOwn) {
        this.proactiveInOwn = proactiveInOwn;
    }

    public Boolean getCaringAdults() {
        return caringAdults;
    }

    public void setCaringAdults(Boolean caringAdults) {
        this.caringAdults = caringAdults;
    }

    public Boolean getGoodSocialSkills() {
        return goodSocialSkills;
    }

    public void setGoodSocialSkills(Boolean goodSocialSkills) {
        this.goodSocialSkills = goodSocialSkills;
    }

    public Boolean getFamilyRules() {
        return familyRules;
    }

    public void setFamilyRules(Boolean familyRules) {
        this.familyRules = familyRules;
    }

    public Boolean getAcademicAchievement() {
        return academicAchievement;
    }

    public void setAcademicAchievement(Boolean academicAchievement) {
        this.academicAchievement = academicAchievement;
    }

    public Boolean getRadicalismOfParent() {
        return radicalismOfParent;
    }

    public void setRadicalismOfParent(Boolean radicalismOfParent) {
        this.radicalismOfParent = radicalismOfParent;
    }

    public Boolean getProblemWithPsych() {
        return problemWithPsych;
    }

    public void setProblemWithPsych(Boolean problemWithPsych) {
        this.problemWithPsych = problemWithPsych;
    }

    public Boolean getWarzoneReturnee() {
        return warzoneReturnee;
    }

    public void setWarzoneReturnee(Boolean warzoneReturnee) {
        this.warzoneReturnee = warzoneReturnee;
    }

    public Boolean getSupportOfViolence() {
        return supportOfViolence;
    }

    public void setSupportOfViolence(Boolean supportOfViolence) {
        this.supportOfViolence = supportOfViolence;
    }

    public Boolean getDisabledParent() {
        return disabledParent;
    }

    public void setDisabledParent(Boolean disabledParent) {
        this.disabledParent = disabledParent;
    }

    public Boolean getMoneyProblems() {
        return moneyProblems;
    }

    public void setMoneyProblems(Boolean moneyProblems) {
        this.moneyProblems = moneyProblems;
    }

    public Boolean getFamilyWithHIV() {
        return familyWithHIV;
    }

    public void setFamilyWithHIV(Boolean familyWithHIV) {
        this.familyWithHIV = familyWithHIV;
    }

    public Boolean getLackOfTransport() {
        return lackOfTransport;
    }

    public void setLackOfTransport(Boolean lackOfTransport) {
        this.lackOfTransport = lackOfTransport;
    }

    public Boolean getUnemployedFamilyMember() {
        return unemployedFamilyMember;
    }

    public void setUnemployedFamilyMember(Boolean unemployedFamilyMember) {
        this.unemployedFamilyMember = unemployedFamilyMember;
    }

    public Boolean getLackOfMedicine() {
        return lackOfMedicine;
    }

    public void setLackOfMedicine(Boolean lackOfMedicine) {
        this.lackOfMedicine = lackOfMedicine;
    }

    public Boolean getFamilyDiscriminated() {
        return familyDiscriminated;
    }

    public void setFamilyDiscriminated(Boolean familyDiscriminated) {
        this.familyDiscriminated = familyDiscriminated;
    }

    public Boolean getBadHousing() {
        return badHousing;
    }

    public void setBadHousing(Boolean badHousing) {
        this.badHousing = badHousing;
    }

    public Boolean getAccessToService() {
        return accessToService;
    }

    public void setAccessToService(Boolean accessToService) {
        this.accessToService = accessToService;
    }

    public Boolean getDivorced() {
        return divorced;
    }

    public void setDivorced(Boolean divorced) {
        this.divorced = divorced;
    }

    public Boolean getSocialIsolation() {
        return socialIsolation;
    }

    public void setSocialIsolation(Boolean socialIsolation) {
        this.socialIsolation = socialIsolation;
    }

    public Boolean getAttachmentDisorder() {
        return attachmentDisorder;
    }

    public void setAttachmentDisorder(Boolean attachmentDisorder) {
        this.attachmentDisorder = attachmentDisorder;
    }

    public Boolean getLackOfSocialSupport() {
        return lackOfSocialSupport;
    }

    public void setLackOfSocialSupport(Boolean lackOfSocialSupport) {
        this.lackOfSocialSupport = lackOfSocialSupport;
    }

    public Boolean getWeakParentalSkills() {
        return weakParentalSkills;
    }

    public void setWeakParentalSkills(Boolean weakParentalSkills) {
        this.weakParentalSkills = weakParentalSkills;
    }

    public Boolean getParentBeenOrphan() {
        return parentBeenOrphan;
    }

    public void setParentBeenOrphan(Boolean parentBeenOrphan) {
        this.parentBeenOrphan = parentBeenOrphan;
    }

    public Boolean getLowEducation() {
        return lowEducation;
    }

    public void setLowEducation(Boolean lowEducation) {
        this.lowEducation = lowEducation;
    }

    public Boolean getSingleParentFamily() {
        return singleParentFamily;
    }

    public void setSingleParentFamily(Boolean singleParentFamily) {
        this.singleParentFamily = singleParentFamily;
    }

    public Boolean getHomelessParents() {
        return homelessParents;
    }

    public void setHomelessParents(Boolean homelessParents) {
        this.homelessParents = homelessParents;
    }

    public Boolean getPregnantMothers() {
        return pregnantMothers;
    }

    public void setPregnantMothers(Boolean pregnantMothers) {
        this.pregnantMothers = pregnantMothers;
    }

    public Boolean getFamilyExConvict() {
        return familyExConvict;
    }

    public void setFamilyExConvict(Boolean familyExConvict) {
        this.familyExConvict = familyExConvict;
    }

    public Boolean getOldParents() {
        return oldParents;
    }

    public void setOldParents(Boolean oldParents) {
        this.oldParents = oldParents;
    }

    public Boolean getFamilyAlcoholProblem() {
        return familyAlcoholProblem;
    }

    public void setFamilyAlcoholProblem(Boolean familyAlcoholProblem) {
        this.familyAlcoholProblem = familyAlcoholProblem;
    }

    public Boolean getParentsMigrantWorkers() {
        return parentsMigrantWorkers;
    }

    public void setParentsMigrantWorkers(Boolean parentsMigrantWorkers) {
        this.parentsMigrantWorkers = parentsMigrantWorkers;
    }

    public Boolean getPoorFamily() {
        return poorFamily;
    }

    public void setPoorFamily(Boolean poorFamily) {
        this.poorFamily = poorFamily;
    }

    public Boolean getFamilyConflicts() {
        return familyConflicts;
    }

    public void setFamilyConflicts(Boolean familyConflicts) {
        this.familyConflicts = familyConflicts;
    }

    public Boolean getLargeFamily() {
        return largeFamily;
    }

    public void setLargeFamily(Boolean largeFamily) {
        this.largeFamily = largeFamily;
    }

    public Boolean getChildTeacherConflict() {
        return childTeacherConflict;
    }

    public void setChildTeacherConflict(Boolean childTeacherConflict) {
        this.childTeacherConflict = childTeacherConflict;
    }

    public Boolean getTeacherParentConflict() {
        return teacherParentConflict;
    }

    public void setTeacherParentConflict(Boolean teacherParentConflict) {
        this.teacherParentConflict = teacherParentConflict;
    }

    public Boolean getPoorQualityOfHelp() {
        return poorQualityOfHelp;
    }

    public void setPoorQualityOfHelp(Boolean poorQualityOfHelp) {
        this.poorQualityOfHelp = poorQualityOfHelp;
    }

    public Boolean getRejectionOfHelp() {
        return rejectionOfHelp;
    }

    public void setRejectionOfHelp(Boolean rejectionOfHelp) {
        this.rejectionOfHelp = rejectionOfHelp;
    }

    public Boolean getNoSchoolHelp() {
        return noSchoolHelp;
    }

    public void setNoSchoolHelp(Boolean noSchoolHelp) {
        this.noSchoolHelp = noSchoolHelp;
    }

    public Boolean getNoFamilyControl() {
        return noFamilyControl;
    }

    public void setNoFamilyControl(Boolean noFamilyControl) {
        this.noFamilyControl = noFamilyControl;
    }

    public Boolean getLackOfProvision() {
        return lackOfProvision;
    }

    public void setLackOfProvision(Boolean lackOfProvision) {
        this.lackOfProvision = lackOfProvision;
    }

    public Boolean getHealthAbsence() {
        return healthAbsence;
    }

    public void setHealthAbsence(Boolean healthAbsence) {
        this.healthAbsence = healthAbsence;
    }

    public Boolean getBadGrades() {
        return badGrades;
    }

    public void setBadGrades(Boolean badGrades) {
        this.badGrades = badGrades;
    }

    public Boolean getFrequentAbsence() {
        return frequentAbsence;
    }

    public void setFrequentAbsence(Boolean frequentAbsence) {
        this.frequentAbsence = frequentAbsence;
    }

    public Boolean getPsychEmotionalProblems() {
        return psychEmotionalProblems;
    }

    public void setPsychEmotionalProblems(Boolean psychEmotionalProblems) {
        this.psychEmotionalProblems = psychEmotionalProblems;
    }

    public Boolean getWeakSelfService() {
        return weakSelfService;
    }

    public void setWeakSelfService(Boolean weakSelfService) {
        this.weakSelfService = weakSelfService;
    }

    public Boolean getDevelopmentalProblem() {
        return developmentalProblem;
    }

    public void setDevelopmentalProblem(Boolean developmentalProblem) {
        this.developmentalProblem = developmentalProblem;
    }

    public Boolean getStressTrauma() {
        return stressTrauma;
    }

    public void setStressTrauma(Boolean stressTrauma) {
        this.stressTrauma = stressTrauma;
    }

    public Boolean getBullying() {
        return bullying;
    }

    public void setBullying(Boolean bullying) {
        this.bullying = bullying;
    }

    public Boolean getGriefOfLoss() {
        return griefOfLoss;
    }

    public void setGriefOfLoss(Boolean griefOfLoss) {
        this.griefOfLoss = griefOfLoss;
    }

    public Boolean getRiskyBehavior() {
        return riskyBehavior;
    }

    public void setRiskyBehavior(Boolean riskyBehavior) {
        this.riskyBehavior = riskyBehavior;
    }

    public Boolean getSelfDamage() {
        return selfDamage;
    }

    public void setSelfDamage(Boolean selfDamage) {
        this.selfDamage = selfDamage;
    }

    public Boolean getOutsideFamily() {
        return outsideFamily;
    }

    public void setOutsideFamily(Boolean outsideFamily) {
        this.outsideFamily = outsideFamily;
    }

    public Boolean getConflictZone() {
        return conflictZone;
    }

    public void setConflictZone(Boolean conflictZone) {
        this.conflictZone = conflictZone;
    }

    public Boolean getReligiousRadicalism() {
        return religiousRadicalism;
    }

    public void setReligiousRadicalism(Boolean religiousRadicalism) {
        this.religiousRadicalism = religiousRadicalism;
    }

    public Boolean getExploitation() {
        return exploitation;
    }

    public void setExploitation(Boolean exploitation) {
        this.exploitation = exploitation;
    }

    public Boolean getPsychDisease() {
        return psychDisease;
    }

    public void setPsychDisease(Boolean psychDisease) {
        this.psychDisease = psychDisease;
    }

    public Boolean getBeenOrphan() {
        return beenOrphan;
    }

    public void setBeenOrphan(Boolean beenOrphan) {
        this.beenOrphan = beenOrphan;
    }

    public Boolean getDomesticViolence() {
        return domesticViolence;
    }

    public void setDomesticViolence(Boolean domesticViolence) {
        this.domesticViolence = domesticViolence;
    }

    public Boolean getChildLabor() {
        return childLabor;
    }

    public void setChildLabor(Boolean childLabor) {
        this.childLabor = childLabor;
    }

    public Boolean getNoCaregiverRisk() {
        return noCaregiverRisk;
    }

    public void setNoCaregiverRisk(Boolean noCaregiverRisk) {
        this.noCaregiverRisk = noCaregiverRisk;
    }

    public Boolean getHasSeasonClothes() {
        return hasSeasonClothes;
    }

    public void setHasSeasonClothes(Boolean hasSeasonClothes) {
        this.hasSeasonClothes = hasSeasonClothes;
    }

    public Boolean getNutrition() {
        return nutrition;
    }

    public void setNutrition(Boolean nutrition) {
        this.nutrition = nutrition;
    }

    public Boolean getDisability() {
        return disability;
    }

    public void setDisability(Boolean disability) {
        this.disability = disability;
    }

    public Boolean getEarlyPregnancy() {
        return earlyPregnancy;
    }

    public void setEarlyPregnancy(Boolean earlyPregnancy) {
        this.earlyPregnancy = earlyPregnancy;
    }

    public Boolean getRiskConflict() {
        return riskConflict;
    }

    public void setRiskConflict(Boolean riskConflict) {
        this.riskConflict = riskConflict;
    }

    public Boolean getAttendance() {
        return attendance;
    }

    public void setAttendance(Boolean attendance) {
        this.attendance = attendance;
    }

    public Boolean getLegalProblems() {
        return legalProblems;
    }

    public void setLegalProblems(Boolean legalProblems) {
        this.legalProblems = legalProblems;
    }

    public String getIntervieweeContact() {
        return intervieweeContact;
    }

    public void setIntervieweeContact(String intervieweeContact) {
        this.intervieweeContact = intervieweeContact;
    }

    public String getRelationToInterviewee() {
        return relationToInterviewee;
    }

    public void setRelationToInterviewee(String relationToInterviewee) {
        this.relationToInterviewee = relationToInterviewee;
    }

    public String getInterviewOrg() {
        return interviewOrg;
    }

    public void setInterviewOrg(String interviewOrg) {
        this.interviewOrg = interviewOrg;
    }

    public String getIntervieweeName() {
        return intervieweeName;
    }

    public void setIntervieweeName(String intervieweeName) {
        this.intervieweeName = intervieweeName;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getOtherWorkplace() {
        return otherWorkplace;
    }

    public void setOtherWorkplace(String otherWorkplace) {
        this.otherWorkplace = otherWorkplace;
    }

    public String getOtherKinshipDegree() {
        return otherKinshipDegree;
    }

    public void setOtherKinshipDegree(String otherKinshipDegree) {
        this.otherKinshipDegree = otherKinshipDegree;
    }

    public String getOtherAge() {
        return otherAge;
    }

    public void setOtherAge(String otherAge) {
        this.otherAge = otherAge;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Boolean getStepParent() {
        return stepParent;
    }

    public void setStepParent(Boolean stepParent) {
        this.stepParent = stepParent;
    }

    public String getMotherApartment() {
        return motherApartment;
    }

    public void setMotherApartment(String motherApartment) {
        this.motherApartment = motherApartment;
    }

    public String getMotherHouse() {
        return motherHouse;
    }

    public void setMotherHouse(String motherHouse) {
        this.motherHouse = motherHouse;
    }

    public String getMotherStreet() {
        return motherStreet;
    }

    public void setMotherStreet(String motherStreet) {
        this.motherStreet = motherStreet;
    }

    public String getMotherDistrict() {
        return motherDistrict;
    }

    public void setMotherDistrict(String motherDistrict) {
        this.motherDistrict = motherDistrict;
    }

    public void setFatherFamilyStatus(Integer fatherFamilyStatus) {
        this.fatherFamilyStatus = fatherFamilyStatus;
    }

    public Integer getFatherFamilyStatus() {
        return fatherFamilyStatus;
    }

    public String getMotherCity() {
        return motherCity;
    }

    public void setMotherCity(String motherDistrict) {
        this.motherCity = motherDistrict;
    }

    public String getMotherFamilyStatus() {
        return motherFamilyStatus;
    }

    public void setMotherFamilyStatus(String motherFamilyStatus) {
        this.motherFamilyStatus = motherFamilyStatus;
    }

    public Integer getMotherAge() {
        return motherAge;
    }

    public void setMotherAge(Integer motherAge) {
        this.motherAge = motherAge;
    }

    public Date getMotherBirthdate() {
        return motherBirthdate;
    }

    public void setMotherBirthdate(Date motherBirthdate) {
        this.motherBirthdate = motherBirthdate;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherApartment() {
        return fatherApartment;
    }

    public void setFatherApartment(String fatherApartment) {
        this.fatherApartment = fatherApartment;
    }

    public String getFatherHouse() {
        return fatherHouse;
    }

    public void setFatherHouse(String fatherHouse) {
        this.fatherHouse = fatherHouse;
    }

    public String getFatherStreet() {
        return fatherStreet;
    }

    public void setFatherStreet(String fatherStreet) {
        this.fatherStreet = fatherStreet;
    }

    public String getFatherDistrict() {
        return fatherDistrict;
    }

    public void setFatherDistrict(String fatherDistrict) {
        this.fatherDistrict = fatherDistrict;
    }

    public String getFatherCity() {
        return fatherCity;
    }

    public void setFatherCity(String fatherCity) {
        this.fatherCity = fatherCity;
    }

    public Integer getFatherAge() {
        return fatherAge;
    }

    public void setFatherAge(Integer fatherAge) {
        this.fatherAge = fatherAge;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setSpecialNeeds(Integer specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public Integer getSpecialNeeds() {
        return specialNeeds;
    }

    public Date getFatherBirthdate() {
        return fatherBirthdate;
    }

    public void setFatherBirthdate(Date fatherBirthdate) {
        this.fatherBirthdate = fatherBirthdate;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}