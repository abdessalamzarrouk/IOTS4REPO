package com.example.projets4.model;

public class Matiere {
        private String title;
        private String schedule;
        private String room;
        private int progress;
        private String status;

    private String nom;
    private String id;

    public Matiere() {}
    public Matiere(String nom) { this.nom = nom; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

        public Matiere(String title, String schedule, String room, int progress, String status) {
            this.title = title;
            this.schedule = schedule;
            this.room = room;
            this.progress = progress;
            this.status = status;
        }


        // Getters
        public String getTitle() { return title; }
        public String getSchedule() { return schedule; }
        public String getRoom() { return room; }
        public int getProgress() { return progress; }
        public String getStatus() { return status; }
    }
