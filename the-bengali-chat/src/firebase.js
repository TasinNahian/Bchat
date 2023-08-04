import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";
import { getStorage } from "firebase/storage";
import { getFirestore } from "firebase/firestore";
// import { getAnalytics } from "firebase/analytics";

const firebaseConfig = {
  apiKey: "AIzaSyBNpFzeoWBBIyLufMPXCE71zUX1nLleTQc",
  authDomain: "the-bengali-chat.firebaseapp.com",
  projectId: "the-bengali-chat",
  storageBucket: "the-bengali-chat.appspot.com",
  messagingSenderId: "104561684514",
  appId: "1:104561684514:web:98869f47ed294f45881a7b",
  measurementId: "G-MQT3KHF7LG"
};

const app = initializeApp(firebaseConfig);
export const auth = getAuth();
export const storage = getStorage();
export const db = getFirestore();
// const analytics = getAnalytics(app);