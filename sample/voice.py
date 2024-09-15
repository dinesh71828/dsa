import speech_recognition as sr
import pyttsx3
import os
import random

def recognize_voice():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Speak the song name:")
        audio = recognizer.listen(source)

        try:
            text = recognizer.recognize_google(audio)
            print("You said:", text)
            return text
        except sr.UnknownValueError:
            print("Could not understand audio")
        except sr.RequestError as e:
            print("Could not request results; {0}".format(e))

def play_song(song_name):
    # Replace with your actual song directory and naming convention
    song_directory = f"C:\\Users\\DELL\\Music\\"
    song_files = [f for f in os.listdir(song_directory) if f.endswith(".mp3")]

    # Simple matching based on song name (improve with audio fingerprinting)
    matching_songs = [f for f in song_files if song_name.lower() in f.lower()]

    if matching_songs:
        selected_song = random.choice(matching_songs)  # Choose a random match
        song_path = os.path.join(song_directory, selected_song)
        # Use a suitable audio library like pygame, vlc, or others to play the song
        # Example using pygame:
        import pygame
        pygame.mixer.init()
        pygame.mixer.music.load(song_path)
        pygame.mixer.music.play()
      
    else:
        print("Song not found")

if __name__ == "__main__":
    song_name = recognize_voice()
    play_song(song_name)
