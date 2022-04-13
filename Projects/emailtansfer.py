import smtplib
import getpass 

smtplib_obj = smtplib.SMTP('smtp.gmail.com',587) 

smtplib_obj.ehlo()

smtplib_obj.starttls()  

input('What is your PW? ') 

password = getpass.getpass() 


