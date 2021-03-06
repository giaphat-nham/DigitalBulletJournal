/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.awt.Color;
import java.awt.FlowLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author DLCH
 */
public class Application extends javax.swing.JFrame {

    MongoClient client = MongoClients.create("mongodb+srv://ngphat:301002@cluster0.8fmtc.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");

    MongoDatabase db = client.getDatabase("DigitalBulletJournal");
    MongoCollection noteCollection = db.getCollection("note");
    MongoCollection eventCollection = db.getCollection("event");
    private static String loggedinUsername = ""; //username da dang nhap
    private static String globalSelectedNote = ""; //note duoc chon
    private static String globalSelectedEvent = ""; //event duoc chon

    public static void setLoggedinUsername(String loggedinUsername) {
        Application.loggedinUsername = loggedinUsername;
    }
    
    /**
     * Creates new form Application
     * @param loggedinUsername
     */
    public Application(String loggedinUsername) {
        Application.loggedinUsername = loggedinUsername;
        initComponents();
        renderNotesList();
        renderEventsList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eventInputPanel = new javax.swing.JPanel();
        eventNameInput = new javax.swing.JTextField();
        eventNameLabel = new javax.swing.JLabel();
        eventDateChooser = new com.toedter.calendar.JDateChooser();
        eventDateChooserLabel = new javax.swing.JLabel();
        noteInputPanel = new javax.swing.JPanel();
        noteTitleInput = new javax.swing.JTextField();
        noteTitleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        newNoteButton = new javax.swing.JButton();
        newEventButton = new javax.swing.JButton();
        noteContentScrollPane = new javax.swing.JScrollPane();
        noteContentArea = new javax.swing.JTextArea();
        noteContentArea.setEnabled(false);
        notesScrollPane = new javax.swing.JScrollPane();
        notesPanel = new javax.swing.JPanel();
        specialEventsScrollPane = new javax.swing.JScrollPane();
        eventsPanel = new javax.swing.JPanel();
        specialEventsLabel = new javax.swing.JLabel();
        notesLabel = new javax.swing.JLabel();
        noteContentLabel = new javax.swing.JLabel();
        noteDeleteButton = new javax.swing.JButton();
        eventDeleteButton = new javax.swing.JButton();

        eventInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        eventInputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        eventInputPanel.setForeground(new java.awt.Color(0, 0, 0));

        eventNameInput.setBackground(new java.awt.Color(255, 255, 255));
        eventNameInput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        eventNameInput.setForeground(new java.awt.Color(0, 0, 0));
        eventNameInput.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        eventNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eventNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        eventNameLabel.setLabelFor(eventNameInput);
        eventNameLabel.setText("Event's name");

        eventDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        eventDateChooser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        eventDateChooser.setForeground(new java.awt.Color(0, 0, 0));
        eventDateChooser.setDateFormatString("d MMM , yyyy");

        eventDateChooserLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eventDateChooserLabel.setForeground(new java.awt.Color(0, 0, 0));
        eventDateChooserLabel.setText("Date");

        javax.swing.GroupLayout eventInputPanelLayout = new javax.swing.GroupLayout(eventInputPanel);
        eventInputPanel.setLayout(eventInputPanelLayout);
        eventInputPanelLayout.setHorizontalGroup(
            eventInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventInputPanelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(eventInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventDateChooserLabel)
                    .addGroup(eventInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(eventDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                        .addComponent(eventNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(eventNameInput)))
                .addGap(62, 62, 62))
        );
        eventInputPanelLayout.setVerticalGroup(
            eventInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventInputPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(eventNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eventDateChooserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        noteInputPanel.setBackground(new java.awt.Color(255, 255, 255));
        noteInputPanel.setForeground(new java.awt.Color(0, 0, 0));

        noteTitleInput.setBackground(new java.awt.Color(255, 255, 255));
        noteTitleInput.setForeground(new java.awt.Color(0, 0, 0));

        noteTitleLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        noteTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        noteTitleLabel.setText("Title");

        javax.swing.GroupLayout noteInputPanelLayout = new javax.swing.GroupLayout(noteInputPanel);
        noteInputPanel.setLayout(noteInputPanelLayout);
        noteInputPanelLayout.setHorizontalGroup(
            noteInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noteInputPanelLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(noteInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noteTitleLabel)
                    .addComponent(noteTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        noteInputPanelLayout.setVerticalGroup(
            noteInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noteInputPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(noteTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Note");
        setBackground(new java.awt.Color(0, 204, 204));
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(0, 204, 204));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Log out");
        logoutButton.setToolTipText("");
        logoutButton.setBorder(null);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newNoteButton.setBackground(new java.awt.Color(0, 153, 153));
        newNoteButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newNoteButton.setForeground(new java.awt.Color(255, 255, 255));
        newNoteButton.setText("New note");
        newNoteButton.setBorder(null);
        newNoteButton.setFocusPainted(false);
        newNoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNoteButtonActionPerformed(evt);
            }
        });

        newEventButton.setBackground(new java.awt.Color(0, 153, 153));
        newEventButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newEventButton.setForeground(new java.awt.Color(255, 255, 255));
        newEventButton.setText("New event");
        newEventButton.setBorder(null);
        newEventButton.setFocusPainted(false);
        newEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEventButtonActionPerformed(evt);
            }
        });

        noteContentArea.setBackground(new java.awt.Color(255, 255, 255));
        noteContentArea.setColumns(20);
        noteContentArea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        noteContentArea.setForeground(new java.awt.Color(0, 0, 0));
        noteContentArea.setRows(5);
        noteContentArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        noteContentArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noteContentInputed(evt);
            }
        });
        noteContentScrollPane.setViewportView(noteContentArea);

        notesScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        notesScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        notesScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        notesScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        notesScrollPane.setToolTipText("");
        notesScrollPane.setAutoscrolls(true);
        notesScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        notesPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        notesScrollPane.setViewportView(notesPanel);

        specialEventsScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        specialEventsScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        specialEventsScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        specialEventsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        eventsPanel.setBackground(new java.awt.Color(255, 255, 255));
        eventsPanel.setAutoscrolls(true);

        javax.swing.GroupLayout eventsPanelLayout = new javax.swing.GroupLayout(eventsPanel);
        eventsPanel.setLayout(eventsPanelLayout);
        eventsPanelLayout.setHorizontalGroup(
            eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        eventsPanelLayout.setVerticalGroup(
            eventsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        specialEventsScrollPane.setViewportView(eventsPanel);

        specialEventsLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        specialEventsLabel.setForeground(new java.awt.Color(255, 255, 255));
        specialEventsLabel.setLabelFor(specialEventsScrollPane);
        specialEventsLabel.setText("Special Events");

        notesLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        notesLabel.setForeground(new java.awt.Color(255, 255, 255));
        notesLabel.setLabelFor(notesScrollPane);
        notesLabel.setText("Notes");

        noteContentLabel.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        noteContentLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteContentLabel.setLabelFor(noteContentScrollPane);
        noteContentLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        noteDeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        noteDeleteButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        noteDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        noteDeleteButton.setText("Delete note");
        noteDeleteButton.setBorder(null);
        noteDeleteButton.setEnabled(false);
        noteDeleteButton.setFocusPainted(false);
        noteDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteDeleteButtonActionPerformed(evt);
            }
        });

        eventDeleteButton.setBackground(new java.awt.Color(255, 102, 102));
        eventDeleteButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eventDeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        eventDeleteButton.setText("X");
        eventDeleteButton.setToolTipText("Delete selected event");
        eventDeleteButton.setBorder(null);
        eventDeleteButton.setEnabled(false);
        eventDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specialEventsScrollPane)
                    .addComponent(notesScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(notesLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(specialEventsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eventDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(noteContentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noteDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(newEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(noteContentScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(newNoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(notesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specialEventsLabel)
                            .addComponent(eventDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(specialEventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteContentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noteDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noteContentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //nut dang xuat
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        if (evt.getSource()==logoutButton){
            System.exit(0);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    //Nut tao note moi
    private void newNoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNoteButtonActionPerformed
        if (evt.getSource()==newNoteButton){
            //Hien thi hop thoai nhap du lieu
            int result = JOptionPane.showConfirmDialog(null, noteInputPanel, 
               "Create new note", JOptionPane.OK_CANCEL_OPTION);
            
            //Neu nguoi dung bam OK
            if (result == JOptionPane.OK_OPTION) {
            String noteTitle = noteTitleInput.getText(); //Lay du lieu da nhap
            //Kiem tra neu tieu de bo trong thi thong bao va yeu cau nhap
            while ("".equals(noteTitle)){
                //Neu du lieu trong thi hien thi hop thoai bat nhap lai du lieu
                result = JOptionPane.showConfirmDialog(null, noteInputPanel, 
                    "Create new note", JOptionPane.OK_CANCEL_OPTION);
                noteTitle = noteTitleInput.getText(); // Lay du lieu da nhap
                
                //Neu du lieu trong thi thong bao
                if (result == JOptionPane.OK_OPTION && "".equals(noteTitle)){
                        JOptionPane.showMessageDialog(null, "Title can not be blank.", "Invalid input", JOptionPane.INFORMATION_MESSAGE);
                }
                //Du lieu hop le thi ngat vong lap
                else {
                    break;
                }
            }//while kiem tra tieu de
            
            //Luu note moi vao db
                if (!"".equals(noteTitle)) {
                    Document newNote = new Document().append("title", noteTitle).append("username", loggedinUsername).append("content", "");
                    noteCollection.insertOne(newNote);
                    renderNotesList();
            }
            }//if nguoi dung nhan OK
        }//if getSource
    }//GEN-LAST:event_newNoteButtonActionPerformed

    
    //Nut tao su kien moi
    private void newEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEventButtonActionPerformed
        if (evt.getSource() == newEventButton){
            //hien thi hop thoai nhap du lieu
            int result = JOptionPane.showConfirmDialog(null, eventInputPanel, 
               "Create new event", JOptionPane.OK_CANCEL_OPTION);
            
            //Neu nguoi dung nhan OK
            if (result == JOptionPane.OK_OPTION) {
                //<Lay du lieu da nhap>
                String eventName = eventNameInput.getText();
                Date eventDateInput = eventDateChooser.getDate();
                //</Lay du lieu da nhap>
                String eventDate; // Bien luu ten event de luu vao csdl
                SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM , yyyy"); //formatter
                
                //Kiem tra neu thong tin trong thi yeu cau nhap lai
                while ("".equals(eventName) || eventDateInput == null) {
                    //Hien thi hop thoai cho nhap lai thong tin
                    result = JOptionPane.showConfirmDialog(null, eventInputPanel, 
                        "Create new event", JOptionPane.OK_CANCEL_OPTION);
                    //<Lay du lieu da nhap>
                    eventName = eventNameInput.getText();
                    eventDateInput = eventDateChooser.getDate();
                    //</Lay du lieu da nhap>
                    
                    //Neu du lieu trong thi thong bao
                    if (result == JOptionPane.OK_OPTION && ("".equals(eventName) || eventDateInput == null)){
                        JOptionPane.showMessageDialog(null, "Input can not be blank.","Invalid input" , JOptionPane.INFORMATION_MESSAGE);
                    }
                    //Neu du lieu hop le thi ngat vong lap
                    else {
                        break;
                    }
                }// while kiem tra input 
                
                //Luu event moi vao db
                if (!"".equals(eventName) && eventDateInput != null) {
                    eventDate = dateFormat.format(eventDateInput);

                    //Tao document de luu vao db
                    Document newEvent = new Document().append("name", eventName).append("username", loggedinUsername).append("date", eventDate);
                    eventCollection.insertOne(newEvent);
                    renderEventsList();
                }
            }//if nguoi dung an OK
        }//if getSource
    }//GEN-LAST:event_newEventButtonActionPerformed

    private void noteContentInputed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noteContentInputed
        if (evt.getSource()==noteContentArea){
            String noteContent = noteContentArea.getText();
            noteCollection.updateOne(Filters.eq("title", globalSelectedNote), Updates.set("content", noteContent));
        }
    }//GEN-LAST:event_noteContentInputed

    //Xoa note
    private void noteDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteDeleteButtonActionPerformed
        if (evt.getSource()==noteDeleteButton){
            noteCollection.deleteOne(new Document("title",globalSelectedNote));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
            noteDeleteButton.setEnabled(false);
            noteContentArea.setEnabled(false);
            noteContentArea.setText("");
            noteContentLabel.setText("");
            renderNotesList();
        }
    }//GEN-LAST:event_noteDeleteButtonActionPerformed

    
    //Nut xoa event da chon
    private void eventDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDeleteButtonActionPerformed
        if (evt.getSource() == eventDeleteButton) {
            eventCollection.deleteOne(new Document("name",globalSelectedEvent));
            eventDeleteButton.setEnabled(false);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
            renderEventsList();
        }
    }//GEN-LAST:event_eventDeleteButtonActionPerformed

    //Render danh sach cac event
    private void renderEventsList() {
        FindIterable<Document> eventsList = eventCollection.find(new Document("username",loggedinUsername));
        eventsPanel.removeAll();
        for (Document document : eventsList) {
            //<Tao button de hien thi>
            try {
                Date eventDate = new SimpleDateFormat("d MMM , yyyy").parse(document.get("date", String.class));
                Date currentDate = Calendar.getInstance().getTime();
                long daysDiff = eventDate.getTime() - currentDate.getTime();
                
                //Neu su kien chua dien ra
                if (daysDiff > 0) {
                    String eventDateTooltip = new SimpleDateFormat("d MMM , YYYY").format(eventDate);
                    String eventName = document.get("name", String.class);
                    JButton newEvent = new JButton(eventName);
                    int diff = (int)daysDiff/1000/60/60/24;
                    
                    //Mau cua su kien theo so ngay con lai
                    //con tu 7 den hon 3 ngay
                    if (diff < 7 && diff >= 3) {
                        newEvent.setBackground(new Color(102, 255, 102));
                        newEvent.setForeground(Color.BLACK);
                    }
                    //con tu 3 ngay den hon 1 ngay
                    else if (diff < 3 && diff >= 1) {
                        newEvent.setBackground(new Color(255, 204, 0));
                        newEvent.setForeground(Color.BLACK);
                    }
                    //con tu nho hon 1 ngay
                    else if (diff < 1) {
                        newEvent.setBackground(new Color(255, 102, 102));
                        newEvent.setForeground(Color.BLACK);
                    }
                    else {
                        newEvent.setBackground(Color.WHITE);
                        newEvent.setForeground(Color.BLACK);
                    }
                    
                    newEvent.setToolTipText(eventDateTooltip);
                    newEvent.setBounds(0, eventsPanel.getComponentCount() * 30, eventsPanel.getWidth(), 30);
                    newEvent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
                    newEvent.setFocusable(false);
                    
                    //ActionListener khi chon vao event
                    newEvent.addActionListener(evt -> {
                        globalSelectedEvent = newEvent.getText();
                        eventDeleteButton.setEnabled(true);
                    });
                    eventsPanel.add(newEvent);
                    eventsPanel.update(eventsPanel.getGraphics());
                }
                //neu su kien da dien ra
                else if (daysDiff < 0) {
                    eventCollection.deleteOne(new Document("name",document.get("name", String.class)));
                }
            } catch (ParseException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }
            //</Tao button de hien thi>
        }
    }
    
    //Render danh sach cac note
    private void renderNotesList() {
        FindIterable<Document> notesList = noteCollection.find(new Document("username",loggedinUsername));
        notesPanel.removeAll();
        for (Document document: notesList) {
            // <Tao button de hien thi>
            String noteTitle;
            noteTitle = document.get("title", String.class);
            JButton newNote = new JButton(noteTitle);
            newNote.setBounds(0, notesPanel.getComponentCount()*30, notesPanel.getWidth(), 30);
            newNote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
            newNote.setBackground(new Color(255,255,255));
            newNote.setFocusable(false);
            newNote.setForeground(new Color(0,0,0));
            newNote.addActionListener(evt -> {
                String selectedNoteTitle;
                selectedNoteTitle = newNote.getText();
                FindIterable<Document> selectedNote = noteCollection.find(new Document("title",selectedNoteTitle));
                
                
                for (Document doc : selectedNote){
                    globalSelectedNote = doc.get("title", String.class);
                    noteContentLabel.setText(selectedNoteTitle);
                    noteContentArea.setText(doc.get("content", String.class));
                    noteContentArea.setEnabled(true);
                    noteDeleteButton.setEnabled(true);
                }
                
            });
            // </tao button de hien thi>
            notesPanel.add(newNote);
            notesPanel.update(notesPanel.getGraphics());
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser eventDateChooser;
    private javax.swing.JLabel eventDateChooserLabel;
    private javax.swing.JButton eventDeleteButton;
    private javax.swing.JPanel eventInputPanel;
    private javax.swing.JTextField eventNameInput;
    private javax.swing.JLabel eventNameLabel;
    private javax.swing.JPanel eventsPanel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newEventButton;
    private javax.swing.JButton newNoteButton;
    private javax.swing.JTextArea noteContentArea;
    private javax.swing.JLabel noteContentLabel;
    private javax.swing.JScrollPane noteContentScrollPane;
    private javax.swing.JButton noteDeleteButton;
    private javax.swing.JPanel noteInputPanel;
    private javax.swing.JTextField noteTitleInput;
    private javax.swing.JLabel noteTitleLabel;
    private javax.swing.JLabel notesLabel;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JScrollPane notesScrollPane;
    private javax.swing.JLabel specialEventsLabel;
    private javax.swing.JScrollPane specialEventsScrollPane;
    // End of variables declaration//GEN-END:variables
}
