package com.esprit.microservices.reclamation.entity;

public enum ReclamationType {
    BUG("Bug Report"),
    FEATURE_REQUEST("Feature Request"),
    GENERAL_FEEDBACK("General Feedback"),
    OTHER("Other");

    private final String displayName;

    ReclamationType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
