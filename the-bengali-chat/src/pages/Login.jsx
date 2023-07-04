import React from 'react'
import Add from "../assets/img/addAvatar.png"

export const Login = () => {
  return (
    <div className="formContainer">
        <div className="formWrapper">
            <span className="logo">The Bengali Chat</span>
            <span className="title">Register</span>
            <form action="">
                <input type="email" placeholder='email'/>
                <input type="password" placeholder='password'/>
                <button>Sign up</button>
            </form>
            <p>Dont have an account? Register</p>
        </div>
    </div>
    )
}
