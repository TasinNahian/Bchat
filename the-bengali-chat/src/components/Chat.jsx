import React, { useContext } from 'react'
import Cam from "../assets/img/cam.png"
import Add from "../assets/img/add.png"
import More from "../assets/img/more.png"
import Messages from '../components/Messages'
import Input from '../components/Input'
import { ChatContext } from '../context/ChatContext'
const Chat = () => {
  const { data } = useContext(ChatContext)
  console.log(data.user.displayName)

  return (
    <div className='chat'>
      <div className="chatInfo">
        <span>{ data.user?.displayName }</span>
        <div className="chatIcon">
          <img src={Cam} alt="" />
          <img src={Add} alt="" />
          <img src={More} alt="" />
        </div>
      </div>
      <Messages/>
      <Input />
    </div>
  )
}
export default Chat;
