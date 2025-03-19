package com.example.mine_notes.listeners;

import com.example.mine_notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
