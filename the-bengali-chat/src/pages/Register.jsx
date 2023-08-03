import React, { useState } from 'react';
import Add from "../assets/img/addAvatar.png";
import { createUserWithEmailAndPassword} from "firebase/auth";
import { auth } from "../firebase";

export const Register = () => {
    const [err, setErr] = useState(false);
    const handleSubmit = (e) =>{
        e.preventDefault()
        const displayName = e.target[0].value;
        const email = e.target[1].value;
        const password = e.target[2].value;
        const file = e.target[3].files[0];
        try {
            createUserWithEmailAndPassword(auth, email, password)
        }catch(err){
            setErr(true);
        }
    }
    return (
    <div className="formContainer">
        <div className="formWrapper">
            <span className="logo">The Bengali Chat</span>
            <span className="title">Register</span>
            <form action="" onSubmit={handleSubmit}>
                <input type="text" placeholder='display name'/>
                <input type="email" placeholder='email'/>
                <input type="password" placeholder='password'/>
                <input type="file" id='file' hidden/>
                <label htmlFor="file">
                    <img src={Add} alt="" />
                    <span>Add an avatar</span>
                </label>
                <button>Sign up</button>
                {err && <span>Something went wrong</span>}
            </form>
            <p>Have an account? Login</p>
        </div>
    </div>
    )
}

