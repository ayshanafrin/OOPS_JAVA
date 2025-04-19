import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
 
// Main class extending JFrame and implementing ActionListener for handling button events 
public class StudentRegistrationForm extends JFrame implements ActionListener { 
 
    // Declare UI components 
    private JTextField nameField, emailField; 
    private JRadioButton maleBtn, femaleBtn, otherBtn; 
    private JComboBox<String> courseBox; 
    private JCheckBox readingCheck, travelingCheck, gamingCheck; 
    private JButton submitBtn, resetBtn; 
    private ButtonGroup genderGroup; 
 
    // Constructor to set up the GUI 
    public StudentRegistrationForm() { 
        // Set the title of the window 
        setTitle("Student Registration Form"); 
        // Set the size of the window 
        setSize(800, 400); 
        // Close the application when the window is closed 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // Center the window on the screen 
        setLocationRelativeTo(null); 
        // Set BorderLayout as the layout manager for the frame 
        setLayout(new BorderLayout()); 
 
        // Create a panel with GridLayout to hold the form fields (7 rows, 2 columns) 
        JPanel formPanel = new JPanel(new GridLayout(7, 2, 10, 10)); 
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding around the form 
 
        // Name Label and TextField 
        formPanel.add(new JLabel("Name:")); 
        nameField = new JTextField(); 
        formPanel.add(nameField); 
 
        // Email Label and TextField 
        formPanel.add(new JLabel("Email:")); 
        emailField = new JTextField(); 
        formPanel.add(emailField); 
 
        // Gender Label and Radio Buttons 
        formPanel.add(new JLabel("Gender:")); 
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Layout for gender buttons 
        maleBtn = new JRadioButton("Male"); 
        femaleBtn = new JRadioButton("Female"); 
        otherBtn = new JRadioButton("Other"); 
 
        // Group radio buttons so only one can be selected at a time 
        genderGroup = new ButtonGroup(); 
        genderGroup.add(maleBtn); 
        genderGroup.add(femaleBtn); 
        genderGroup.add(otherBtn); 
 
        // Add radio buttons to gender panel 
        genderPanel.add(maleBtn); 
        genderPanel.add(femaleBtn); 
        genderPanel.add(otherBtn); 
        formPanel.add(genderPanel); 
 
        // Course Label and ComboBox 
        formPanel.add(new JLabel("Course:")); 
        String[] courses = { "MCA", "B.Tech", "B.Sc", "B.Com", "BA" }; // Course options 
        courseBox = new JComboBox<>(courses); 
        formPanel.add(courseBox); 
 
        // Hobbies Label and CheckBoxes 
        formPanel.add(new JLabel("Hobbies:")); 
        JPanel hobbiesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Layout for hobbies checkboxes 
        readingCheck = new JCheckBox("Reading"); 
        travelingCheck = new JCheckBox("Traveling"); 
        gamingCheck = new JCheckBox("Gaming"); 
        hobbiesPanel.add(readingCheck); 
        hobbiesPanel.add(travelingCheck); 
        hobbiesPanel.add(gamingCheck); 
        formPanel.add(hobbiesPanel); 
 
        // Submit and Reset Buttons 
        submitBtn = new JButton("Submit"); 
        resetBtn = new JButton("Reset"); 
        submitBtn.addActionListener(this); // Register event handler 
        resetBtn.addActionListener(this); 
        formPanel.add(submitBtn); 
        formPanel.add(resetBtn); 
 
        // Add form panel to the center of the frame 
        add(formPanel, BorderLayout.CENTER); 
 
        // Make the frame visible 
        setVisible(true); 
    } 
 
    // Event handling for Submit and Reset buttons 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == submitBtn) { 
            // Get values from text fields 
            String name = nameField.getText().trim(); 
            String email = emailField.getText().trim(); 
 
            // Validation: Name and Email cannot be empty 
            if (name.isEmpty() || email.isEmpty()) { 
                JOptionPane.showMessageDialog(this, "Name and Email are required!", 
"Validation Error", JOptionPane.ERROR_MESSAGE); 
                return; 
            } 
 
            // Get selected gender 
            String gender = ""; 
            if (maleBtn.isSelected()) gender = "Male"; 
            else if (femaleBtn.isSelected()) gender = "Female"; 
            else if (otherBtn.isSelected()) gender = "Other"; 
 
            // Get selected course 
            String course = (String) courseBox.getSelectedItem(); 
 
            // Get selected hobbies 
            StringBuilder hobbies = new StringBuilder(); 
            if (readingCheck.isSelected()) hobbies.append("Reading "); 
            if (travelingCheck.isSelected()) hobbies.append("Traveling "); 
            if (gamingCheck.isSelected()) hobbies.append("Gaming "); 
 
            // Prepare and display the submitted data in a dialog 
            String message = String.format( 
                "Name: %s\nEmail: %s\nGender: %s\nCourse: %s\nHobbies: %s", 
                name, email, gender, course, hobbies.toString().trim() 
            ); 
 
            JOptionPane.showMessageDialog(this, message, "Submitted Data", 
JOptionPane.INFORMATION_MESSAGE); 
 
        } else if (e.getSource() == resetBtn) { 
            // Reset all form fields to default 
            nameField.setText(""); 
            emailField.setText(""); 
            genderGroup.clearSelection(); 
            courseBox.setSelectedIndex(0); 
            readingCheck.setSelected(false); 
            travelingCheck.setSelected(false); 
            gamingCheck.setSelected(false); 
        } 
    } 
 
    // Main method to launch the form 
    public static void main(String[] args) { 
        // Ensure thread-safe UI creation 
        SwingUtilities.invokeLater(StudentRegistrationForm::new); 
    } 
}