import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

# Create the MIME object
msg = MIMEMultipart()
msg['From'] = "udaykiranbikki@gmail.com"
msg['To'] = "kiranuday7673@gmail.com"
msg['Subject'] = "Welcome to Our application!"

# HTML content of the email
html = """
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        .header {
            text-align: center;
            color: #333333;
        }
        .message {
            margin-top: 20px;
            color: #666666;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Welcome to food truck application!</h1>
        </div>
        <div class="message">
            <p>Hello,</p>
            <p>We are excited to have you as part of us. This is a place where you can connect and share with like-minded individuals.</p>
            <p>If you have any questions or need assistance, feel free to reach out to us.</p>
            <p>Best regards,</p>
            <p>The food truck application Team</p>
        </div>
    </div>
</body>
</html>
"""

# Attach the HTML content to the message
msg.attach(MIMEText(html, 'html'))

# Create an SMTP session
s = smtplib.SMTP('smtp.gmail.com', 587)
s.starttls()

# Login to your Gmail account
s.login("udaykiranbikki@gmail.com", "yljxihbepczmcshm")

# Send the email
s.sendmail("udaykiranbikki@gmail.com", "kiranuday7673@gmail.com", msg.as_string())

# Terminate the session
s.quit()
