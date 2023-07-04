import React from 'react'
import Img from "../assets/img/img.png"
import Attach from "../assets/img/attach.png"
const Input = () => {
  return (
    <div className='input'>
      {/* <textarea placeholder='Type something...'></textarea> */}
      <input type="text" placeholder='Type something...' />
      <div className="send">
        <img src={Attach} alt="" />
        <input type="file" id="file" hidden/>
        <label htmlFor="file">
          <img src={Img} alt="" />
        </label>
        <button>Send</button>
      </div>
    </div>
  )
}
export default Input
