import React from 'react'
import Add from "../assets/img/addAvatar.png"

export const Register = () => {
  return (
    <div className="formContainer">
        <div className="formWrapper">
            <span className="logo">The Bengali Chat</span>
            <span className="title">Register</span>
            <form action="">
                <input type="text" placeholder='display name'/>
                <input type="email" placeholder='email'/>
                <input type="password" placeholder='password'/>
                <input type="file" id='file' hidden/>
                <label htmlFor="file">
                    <img src={Add} alt="" />
                    <span>Add an avatar</span>
                </label>
                <button>Sign up</button>
            </form>
            <p>Have an account? Login</p>
        </div>
    </div>
    )
}
